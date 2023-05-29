class Solution {
    public int maxProduct(int[] nums) {
        
        int len = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        
        int prefixProduct = 1;
        int suffixProduct = 1;
        
        for (int i = 0; i < len; i++) {
            
            if (prefixProduct == 0) {
               prefixProduct = 1; 
            } 
            if (suffixProduct == 0) {
               suffixProduct = 1; 
            } 
            
            prefixProduct *= nums[i];
            suffixProduct *= nums[len - i - 1];
            
            maxProduct = Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }
        
        return maxProduct;
    }
}