class NQueenProblem {
 
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> res = new ArrayList<List<String>>();
        int[] colns = new int[n];
        int[][] diags = new int[2][2*n-1];
        
        //Initial board
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(n, board, 0, colns, diags, res);
        return res;
    }
    
    // i is row
    public void backtrack(int n, char[][] board, int i, int[] colns, int[][] diags, List<List<String>> res) {
        if (i == n) {
            List<String> soln = new ArrayList<String>();
            for (int k=0; k<n; k++) {
                soln.add(String.valueOf(board[k]));
            }
            res.add(soln);
            return;
        }
        
        // Find a column to place Q in this row
        for (int j=0; j<n; j++) {
            int diag0 = i-j+n-1;
            int diag1 = i+j;
            
			// move is not possible
            if (colns[j] == 1 || diags[0][diag0] == 1 || diags[1][diag1] == 1) {
                continue;
            }            
            // make move
            board[i][j] = 'Q';
            colns[j] = 1;
            diags[0][diag0] = 1;
            diags[1][diag1] = 1;
                
            backtrack(n, board, i+1, colns, diags, res); //backtrack
                
            //undo move
            colns[j] = 0;
            diags[0][diag0] = 0;
            diags[1][diag1] = 0;
            board[i][j] = '.';
        }
    }
}