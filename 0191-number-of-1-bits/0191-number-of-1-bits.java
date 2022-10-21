public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count  = 0;
        for(int i = 0; i < 32; i++) {
            int mask = (1 << i);
            if((n & mask) != 0) count++;
        }
        
        // int count  = 0; 
        // while (n>0){
        //     n = n &(n -1);
        //     count++;
        // }
        return count; 
    }
}