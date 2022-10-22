class Solution {
    public String minWindow(String s, String t) {
        
        int n = t.length();
        int m = s.length();
        
        if (m <n || s == null || t == null ){
            return "";
        }
          
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (int i = 0; i<n; i++){
            char c = t.charAt(i);
            
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        int i = 0, j = 0;
        int count = hm.size();
        int left = 0, right = m -1, minLength = m; 
        
        boolean flag = false;
        
        while (j < m){
            char endChar = s.charAt(j++);
            if (hm.containsKey(endChar)){
                hm.put(endChar, hm.get(endChar) - 1);
                if (hm.get(endChar) == 0) count -= 1;
            }
            
            if (count > 0) continue; 
            
            while (count == 0){
                char startChar = s.charAt(i++);
                
                if (hm.containsKey(startChar)){
                    hm.put(startChar, hm.get(startChar) + 1);
                    if (hm.get(startChar) > 0) count +=1;
                }
                
            }
            
            if ((j - i) < minLength){
                left = i;
                right = j;
                
                minLength = j - i;
                
                flag = true;
            } 
        }
        
        return !flag ? "" : s.substring(left -1, right);
        
    }
}