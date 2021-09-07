class MaximumPathSumOnTree {
    private int max = -1001;
    
    public int maxPathSum(TreeNode root) {
        traverseAndSetMax(root);
        return max;
    }
    
    private int traverseAndSetMax(TreeNode root) {
        if(root==null) { return 0; }
        int left = traverseAndSetMax(root.left);
        int right = traverseAndSetMax(root.right);
        
        if(root.val > max) {max = root.val;}
        if((root.val + left + right) > max) {max = root.val + left + right;}
        
        int maxlr = left > right ? left : right;
        if((maxlr + root.val) > max) {max = maxlr + root.val;}
        if(maxlr <= 0) { return root.val;}
        
        if(root.val<0) {
            if(root.val + maxlr > 0) {return root.val + maxlr;}
            else { return root.val; }
        } else {
            return root.val + maxlr;
        }
    }
}