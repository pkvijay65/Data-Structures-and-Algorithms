class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        
        int[] ans = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                ans[i] = nums[i];
            }
            else ans[i] = ans[i-1] + nums[i];
        }
        
        return ans;
    }
}