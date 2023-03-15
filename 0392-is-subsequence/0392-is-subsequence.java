class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int lenT  = t.length();
        int lenS = s.length();
        
        int i = 0, j = 0;
        
        if (lenS < 1) {
            return true;
        }
        
        while (i < lenT) {
            char chT = t.charAt(i);
            char chS = s.charAt(j);
            
            if (chT == chS) {
                j++;
            }
            
            if (j == lenS) {
                return true;
            }
            
            i++;
        }
        return false;
        
    }
}