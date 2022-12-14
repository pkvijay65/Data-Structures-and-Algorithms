//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.maxStairHeight(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxStairHeight(int N) {
        // code here
        
        int low = 1;
        int high = N;
        int ans = 0;
        
        while(low <= high){
            
            long mid = low + (high - low)/2;
            
            long blocksUsed = mid *(mid + 1)/2;
            
            if (blocksUsed == N){
                return (int)mid;
            }
            
            else if (blocksUsed < N){
                ans = (int)mid;
                low = (int)mid + 1;
            }
            
            else high = (int)mid -1;
        }
        
        return ans;
    }
};