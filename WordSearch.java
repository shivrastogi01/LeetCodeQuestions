class WordSearch {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
       boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = solve(board, 0, word.length(),i, j, word,visited);
                    if(ans == true) return ans;
                }
            }
        } 
        return false;
    }
    boolean solve(char[][] grid, int i, int n, int x, int y, String word,boolean[][] visited){        
        
        if(i == n - 1){
            return true;
        }
        
        visited[x][y] = true;
               
        for(int dir = 0; dir < 4; dir++){
            int xx = x + dx[dir];
            int yy = y + dy[dir];
            if(xx >= 0 && xx < grid.length && yy >= 0 && yy < grid[0].length && grid[xx][yy] == word.charAt(i+1) && visited[xx][yy] == false){
                boolean res = solve(grid, i + 1, n, xx, yy, word,visited);
                if(res == true) return true;
            }
        }
        visited[x][y] = false;
        return false;
    }
}