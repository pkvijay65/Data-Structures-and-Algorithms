class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();
        
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');
        
        
        for (int i = 0; i< len; i++) {
            char ch = s.charAt(i);
            
            if (ch == '}' || ch == ']' || ch == ')') {
                if (st.isEmpty() || st.peek() != hm.get(ch)) {
                    return false;
                }
                st.pop();
            }
            else st.push(ch);
        }
        
        if (!st.isEmpty()) {
            return false;
        }
        else return true;
    }
}