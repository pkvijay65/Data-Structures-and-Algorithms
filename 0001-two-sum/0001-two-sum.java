class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        
        Map<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        
        for (int i = 0; i < len; i++) {
            int curElement = nums[i];
            
            if (hm.containsKey(target - curElement)) {
                ans[0] = hm.get(target - curElement);
                ans[1] = i;
            } else hm.put(curElement, i);
        }
        
        return ans;
    }
}