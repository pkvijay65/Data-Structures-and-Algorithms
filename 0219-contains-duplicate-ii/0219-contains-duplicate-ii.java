class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (k == 0){
            return false;
        }
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for (int i = 0; i<nums.length; i++){
            int cur_num = nums[i];
            
            if (hm.containsKey(cur_num) && (i - hm.get(cur_num) <=k)){
                return true;
            }
            hm.put(cur_num, i);
        }
        
        return false;
    }
}