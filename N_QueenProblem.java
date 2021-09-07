class N_QueenProblem{
    public List<List<String>> solveNQueens(int n) {
        boolean[] pos = new boolean[n+2*n-1+2*n-1];
        int[] pos2 = new int[n];
        List<List<String>> ans = new ArrayList();
        helper(n,0,pos,pos2,ans);
        return ans;
    }
    private void helper(int n, int row, boolean[] pos, int[] pos2, List<List<String>> ans) {
        if(row==n) {
            construct(n,pos,pos2,ans);
            return;
        }
        for(int i=0;i<n;i++) {
            if(pos[i] || pos[n+i+row] || pos[n+2*n-1+n-1+i-row])
                continue;
            pos[i] = true;
            pos[n+i+row] = true;
            pos[n+2*n-1+n-1+i-row] = true;
            pos2[row]=i;
            helper(n,row+1,pos,pos2,ans);
            pos[i] = false;
            pos[n+i+row] = false;
            pos[n+2*n-1+n-1+i-row] = false;
        }
    }
    private void construct(int n, boolean[] pos, int[] pos2, List<List<String>> ans) {
        List<String> sol = new ArrayList();
        for(int r=0;r<n;r++) {
            char[] queenRow = new char[n];
            Arrays.fill(queenRow,'.');
            queenRow[pos2[r]]='Q';
            sol.add(new String(queenRow));
        }
        ans.add(sol);
    }
}