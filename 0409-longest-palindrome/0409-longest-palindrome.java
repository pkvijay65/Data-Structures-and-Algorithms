class Solution {
    public int longestPalindrome(String s) {
        int len = s.length();
        
        HashMap<Character, Integer> freqCount = new HashMap<>();
        int oddFreqCount = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            
            freqCount.put(ch, freqCount.getOrDefault(ch, 0) + 1);
            
            if (freqCount.get(ch) % 2 != 0) {
                oddFreqCount++;
            }
            else oddFreqCount--;
        }
        
        if (oddFreqCount > 1) {
            return len - oddFreqCount + 1;
        }
        
        else return len;
    }
}