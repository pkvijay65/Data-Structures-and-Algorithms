class Solution {
    Boolean dp[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();
        dp = new Boolean[n + 1][m + 1];
        //dp[i][j] - represents if c[0, i + j - 1] is an interleaving string of A[0 -> i -1] and B[0 -> j -1]
        return check(0, 0, 0, n, m, s1, s2, s3);
    }
    
        public boolean check(int i, int j, int k, int n, int m, String A, String B, String C){
        if(i == n && j == m && k == C.length()) {
            return true;
        }

        if(k == C.length()) {
            return false;
        }

        //memoization
        if(dp[i][j] != null) {
            return dp[i][j];
        }


        char cStringChar = C.charAt(k);
        boolean ans = false;

        if(i < n && A.charAt(i) == cStringChar) {
            ans |=  check(i + 1, j, k + 1, n, m, A, B, C);
        }

        if (j < m && B.charAt(j) == cStringChar) {
            ans |= check(i, j + 1, k + 1, n, m, A, B, C);
        }

        return dp[i][j] = ans;
    }
}