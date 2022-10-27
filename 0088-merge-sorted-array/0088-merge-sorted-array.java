class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;
        int j = nums1.length-1;
        int k = nums2.length-1;
        while(i>=0 && k>=0) {
            if(nums1[i]>nums2[k]) {
                nums1[j--] = nums1[i];
                nums1[i--] = 0;
            } else {
                nums1[j--] = nums2[k--];
            }
        }
        if(i<0){
            while(j>=0) {
                nums1[j--] = nums2[k--];
            }
        }
    }
}