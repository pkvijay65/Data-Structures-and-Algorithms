class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        

        int[][] numWays = new int[m][n];
        
        for (int[] row : numWays) {
            Arrays.fill(row, -1);
        }
        
        return findNumWays(grid, numWays, m - 1, n - 1);
    }
    
    private int findNumWays(int[][] grid, int[][] numWays, int i , int j) {
        //base cases
        
        if (i == 0 && j == 0) {
            return 1;
        }
        else if (i < 0 || j < 0) {
            return 0;
        }
        
        if (numWays[i][j] != -1) {
            return numWays[i][j];
        }
        
        return numWays[i][j] = findNumWays(grid, numWays, i - 1, j) + findNumWays(grid, numWays, i, j - 1);
    }
}