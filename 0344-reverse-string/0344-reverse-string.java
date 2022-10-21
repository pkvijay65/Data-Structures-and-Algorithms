class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        
        int p_1 = 0;
        int p_2 = n -1;
        
        while (p_1<p_2){
            char temp = s[p_1];
            s[p_1] = s[p_2];
            s[p_2] = temp;
            
            p_1++;
            p_2--;
        }
    }
}