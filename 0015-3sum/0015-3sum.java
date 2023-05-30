class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        
        int len = nums.length;
        Arrays.sort(nums);
        
        res = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < len; i++) {
            
            if (i == 0 || nums[i - 1] != nums[i]) {
                find2Sum(i + 1, len - 1, nums, -nums[i]);
            }
            
        }
        
        return res;
    }
    
    private void find2Sum(int i, int j, int[] nums, int target) {
        int len = nums.length;
        
        while (i < j) {
            int sum = nums[i] + nums[j];
            
            if (sum < target) {
                i++;
            }
            else if (sum > target) {
                j--;
            }
            else {
                res.add(new ArrayList<>(Arrays.asList(-target, nums[i], nums[j])));
                
                i++;
                j--;
                
                while (i < j && nums[i - 1] == nums[i]) {
                    i++;
                }
                
                while (i < j && nums[j + 1] == nums[j]) {
                    j--;
                }
            }
        }
    }
    
}