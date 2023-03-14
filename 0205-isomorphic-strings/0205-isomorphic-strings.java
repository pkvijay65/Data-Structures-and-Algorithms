class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mappingTable_S_to_T = new int[256];
        int[] mappingTable_T_to_S  = new int[256];
        Arrays.fill(mappingTable_S_to_T, -1);
        Arrays.fill(mappingTable_T_to_S, -1);
        
        int len = s.length();
        
        for (int i = 0; i< len; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Case 1: No mapping exists in either of the dictionaries
            if (mappingTable_S_to_T[charS] == -1 && mappingTable_T_to_S[charT] == -1) {
                mappingTable_S_to_T[charS] = charT;
                mappingTable_T_to_S[charT] = charS;
            }
            
            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both 
            else if (!(mappingTable_S_to_T[charS] == charT && mappingTable_T_to_S[charT] == charS)) {
                return false;
            }
        }
        
        return true;
    }
}