class Solution {
    public int partitionString(String s) {
        int len = s.length();
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            
            if (hs.contains(ch)) {
                ans++;
                hs.clear();
            }
            hs.add(ch);
        }
        
        return ans + 1;
    }
}