class Solution {
    int dR[] = {-1, 1, 0, 0};
    int dC[] = {0, 0, 1, -1};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int [][]ans = image;
        
        int iniColor = image[sr][sc];


        DFS(image,sr,sc, color, iniColor, ans);
        return ans;
    }
    
    private void DFS(int[][] image, int sr, int sc, int color, int iniColor, int [][]ans) {
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i < 4; i++){
            int newRow = sr + dR[i];
            int newCol = sc + dC[i];

            if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && image[newRow][newCol] == iniColor && ans[newRow][newCol] != color){
                DFS(image, newRow, newCol, color, iniColor, ans);
            }
        }
    }
}