class Solution {
    public int trap(int[] height) {
        int N = height.length;

        int l = 0;
        int r = N - 1;

        int left_max = height[0];
        int right_max = height[N-1];
        int ans = 0;

        while (l < r){

            left_max = Math.max(left_max, height[l]);
            right_max = Math.max(right_max, height[r]);

            if (left_max < right_max){
                ans += left_max - height[l];
                l++;
            }
            else {
                ans+= right_max - height[r];
                r--;
            }
        }
        return ans;
    }
}