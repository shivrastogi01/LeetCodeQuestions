class Solution {
    private static final int[][] DIRS = new int[][] { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
    record Cell (int i, int j, int steps, int k, int est) {}

    public int shortestPath(int[][] grid, int k) {
        int rows = grid.length, cols = grid[0].length, max = rows + cols - 2;
        if (k >= max - 1) return max; // if you add this line, it will eliminate most of the test cases...
        int[][] visited = new int[rows][cols];
        // est is all steps used so far + manhattan distance for rest of the steps
        PriorityQueue<Cell> q = new PriorityQueue<>((a, b) -> (a.est - b.est));

        for (int[] row : visited) Arrays.fill(row, -1);
        q.offer(new Cell(0, 0, 0, k, max));
        visited[0][0] = k;

        while (!q.isEmpty()) {
            Cell cur = q.poll();
            if (cur.est - cur.steps <= cur.k) return cur.est; // optional early termination
            if (cur.i == rows - 1 && cur.j == cols - 1) return cur.steps;
            for (var dir : DIRS) {
                int i = cur.i + dir[0], j = cur.j + dir[1], nextK;
                if (i < 0 || j < 0 || i >= rows || j >= cols) continue;
                if ((nextK = cur.k - grid[i][j])  <= visited[i][j]) continue;
                q.offer(new Cell(i, j, cur.steps + 1, nextK, max - i - j + cur.steps + 1));
                visited[i][j] = nextK;
            }
        }

        return -1;
    }
}