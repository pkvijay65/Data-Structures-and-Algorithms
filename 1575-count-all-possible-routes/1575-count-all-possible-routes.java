class Solution {
    private static final int MOD = (int)1e9 + 7;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int len = locations.length;
        
        int[][] dp = new int[len + 1][fuel + 1];
        
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        
        return findTotalRoutes(locations, start, finish, fuel, dp);
    }
    
    private int findTotalRoutes(int[] locations, int start, int finish, int fuel, int[][] dp) {
        
        //base case
        if (fuel < 0) {
            return 0;
        }
        
        //check if already calculated and memoized
        if (dp[start][fuel] != -1) {
            return dp[start][fuel];
        }
        
        //calculate and memoize it
        int ans = 0;
        
        if (start == finish) ans++;
        
        for (int i = 0; i < locations.length; i++) {
            if (i == start || Math.abs(locations[i] - locations[start]) > fuel) continue;
            
            ans += findTotalRoutes(locations, i, finish, fuel - Math.abs(locations[i] - locations[start]), dp);
            
            ans %= MOD;
        }
        
        return dp[start][fuel] = ans % MOD;
        
    }
}