class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] result = new int[spells.length];
        
        int potionsLength = potions.length;
        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i++){
            
            int minIndex = binarySearch(potions, success, spells[i]);
            result[i] = potionsLength - minIndex;
        }
        
        return result;
    }
    
    private int binarySearch(int[] potions, long success, int spellStrength) {
        int low = 0;
        int high = potions.length;
        
        int mid = 0;
        
        while (low < high) {
            mid = low + (high - low)/2;
            
            if ((potions[mid] * (1l*spellStrength) )< success) {
                low = mid + 1;
            }
            else high = mid;
        }
        
        return low;
    }
}