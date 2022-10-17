class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int N = nums.size();

        for (int i = 0; i<N; i++){
           

            while ((nums[i] >= 1 && nums[i] <=N) && (nums[nums[i] - 1] != nums[i])){
                    swap(nums[i], nums[nums[i] -1]);
            }
           
        }

        for (int i = 0; i<N; i++){
            if(i+1 != nums[i]){
                return i+1; 
            }
        }
        return N+1; 
    }
};