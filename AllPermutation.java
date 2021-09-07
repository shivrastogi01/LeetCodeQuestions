class AllPermutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;
        boolean[] used =new boolean[nums.length];
        List<Integer> permutation =new ArrayList<>();
        helper(nums,permutation,used,res);
        return res;
    }
    private void helper(int[] nums,List<Integer> permutation , boolean[] used,List<List<Integer>> res){
        if(permutation.size()== nums.length){
            res.add(new ArrayList<>(permutation));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])
                continue;
            
            used[i]=true;
            permutation.add(nums[i]);
            helper(nums,permutation,used,res);
            permutation.remove(permutation.size()-1);
            used[i]=false;
        
        }
            
    }
}