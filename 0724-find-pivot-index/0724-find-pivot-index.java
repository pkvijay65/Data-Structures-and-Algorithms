class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        
        if (len == 1) {
            return 0;
        }
        
        int leftSum = 0; //sum till ith index element excluding ith index element
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }
        
        for (int i = 0; i < len; i++) {
            if (2 * leftSum == totalSum - nums[i]) {
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
//         int[] prefixSum = new int[len];
//         int[] suffixSum = new int[len];
        
        
//         for (int i = 0; i < len; i++) {
//             if (i == 0) {
//                 prefixSum[i] = nums[i];
//             } else prefixSum[i] = prefixSum[i-1] + nums[i];
//         }
        
//         for (int i = len - 1; i >= 0; i--) {
//             if (i == len - 1) {
//                 suffixSum[i] = nums[i];
//             } else suffixSum[i] = suffixSum[i+1] + nums[i];
//         }
        
//         for (int i = 0; i <= len - 1; i++) {
//             if (i == 0) {
//                 if (suffixSum[i+1] == 0) {
//                     return i;
//                 }
//             } else if (i == len - 1) {
//                 if (prefixSum[len -2] == 0) {
//                     return i;
//                 }
//             } else if (prefixSum[i - 1] == suffixSum[i + 1]) {
//                 return i;
//             }
//         }
        
//         return -1;
    }
}