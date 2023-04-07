class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == 0 || j == 0 || i == rows - 1 || j == col - 1) & grid[i][j] == 1) {
                    dfs(i, j, grid);
                }
            }
        }
        
        int count = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs (int i, int j, int[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        
        grid[i][j] = 0;
        
        for (int d = 0; d < 4; d++) {
            int x = i + dx[d];
            int y = j + dy[d];
            
            if (x >= 0 && y >= 0 && x < rows && y < col && grid[x][y] == 1) {
                dfs(x, y, grid);
            }
        }
    }
}