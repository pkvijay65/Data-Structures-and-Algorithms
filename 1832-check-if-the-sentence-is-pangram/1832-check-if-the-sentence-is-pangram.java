class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean A[] = new boolean[26];
        for (int i = 0; i<sentence.length(); i++){
            char currChar = sentence.charAt(i);
            A[currChar - 'a'] = true;
        }
        
        for (int i = 0; i<26; i++){
            if (A[i] == false){
                return false;
            }
        }
        return true;
//         HashSet<Character> hs = new HashSet<Character>();
        
//         for (int i = 0; i<sentence.length(); i++){
//             hs.add(sentence.charAt(i));
//         }
        
//         return hs.size() == 26;
        
        // for (int i = 0; i<26; i++){
        //     char ch = (char)('a' + i);
        //     if (!hs.contains(ch)){
        //         return false;
        //     }
        // }
        // return true;
        
    }
}