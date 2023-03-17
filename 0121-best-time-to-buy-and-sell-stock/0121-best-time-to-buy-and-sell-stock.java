class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < len; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
//         int[] prefixMin = new int[len];
        
//         for (int i = 0; i < len; i++) {
//             if (i == 0) {
//                 prefixMin[i] = prices[i];
//             }
//             else prefixMin[i] = Math.min(prices[i], prefixMin[i-1]);
//         }
        
//         int[] suffixMax = new int[len];
        
//         for (int i = len - 1; i >= 0; i--) {
//             if (i == len - 1) {
//                 suffixMax[i] = prices[i];
//             }
//             else suffixMax[i] = Math.max(prices[i], suffixMax[i+1]);
//         }
        
//         int maxProfit = 0;
        
//         for (int i = 0; i < len ; i++) {
//             maxProfit = Math.max(maxProfit, suffixMax[i] - prefixMin[i]);
//         }
        
//         return maxProfit;
    }
}