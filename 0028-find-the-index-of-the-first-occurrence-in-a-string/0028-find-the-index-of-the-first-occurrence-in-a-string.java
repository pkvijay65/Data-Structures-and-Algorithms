class Solution {
    public int strStr(String haystack, String needle) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(needle).append('#').append(haystack);
        
        int LPS[]= new int[sb.length()];
        
        LPS[0] = 0;
        
        for (int i = 1; i<sb.length(); i++){
            int x = LPS[i-1];
            
            while (sb.charAt(i)!= sb.charAt(x)){
                if (x == 0){
                    x = -1;
                    break;
                }
                
                else x = LPS[x-1];
            }
            
            LPS[i] = x + 1;
            
            if (LPS[i] == needle.length()){
                return i - 2*needle.length(); 
            }
        }
        
        return -1;
        
    }
}