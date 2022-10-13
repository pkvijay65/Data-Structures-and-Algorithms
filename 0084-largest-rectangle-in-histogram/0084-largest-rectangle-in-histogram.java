class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int left_min[] = generateLeftSmall(heights);
        int right_min[] = generateRightSmall(heights);
        
        int ans = Integer.MIN_VALUE;
        int area;
        int width;
        for (int i = 0; i<n; i++){
            int height = heights[i];
            int p_1 = 0;
            int p_2 = n-1;
            if (left_min[i] != -1){
                p_1 = left_min[i] + 1;
            }

            if (right_min[i] != -1){
                p_2 = right_min[i] -1;
            }
            width = (p_2 - p_1 +1);
            area = height*width;
            ans = Math.max(ans, area);
        }
        return ans;
        
    }
    int[] generateLeftSmall(int A[]){
         int n = A.length;
         Stack<Integer> s = new Stack();
         int left_min[] = new int[n];
         for (int i = 0; i<n; i++){
            while (!s.isEmpty() && A[s.peek()]>= A[i]){
                s.pop();
            }
            if (s.isEmpty()){
                left_min[i] = -1;
            }
            else left_min[i] = s.peek();

            s.push(i);
            //  System.out.print(left_min[i]);    
        }
        return left_min;
    }

    int[] generateRightSmall(int A[]){
        int n = A.length;
         Stack<Integer> s = new Stack();
        int right_min[] = new int[n];
        for (int i = n-1; i>=0; i--){
            while (!s.isEmpty() && A[s.peek()]>= A[i]){
                s.pop();
            }
            if (s.isEmpty()){
                right_min[i] = -1;
            }
            else right_min[i] = s.peek();

            s.push(i);
            // System.out.print(right_min[i]);
        }
        return right_min;
    }
}