class SortColors {
    public void sortColors(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

        }
        
        int range = max - min + 1;
        int[] farr = new int[range];
        
        for(int i = 0; i < nums.length; i++)
        {
            int idx = nums[i] - min;
            farr[idx]++;
        }
        
        for(int i = 1; i < farr.length; i++)
        {
            farr[i] = farr[i] + farr[i - 1];
        }
        
        int[] ans = new int[nums.length];
        
        for(int i = nums.length - 1; i >= 0; i--)
        {
            int val = nums[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            farr[val - min]--;
        }
        
        for(int i = 0; i < ans.length; i++)
        {
            nums[i] = ans[i];
        }
    }
}