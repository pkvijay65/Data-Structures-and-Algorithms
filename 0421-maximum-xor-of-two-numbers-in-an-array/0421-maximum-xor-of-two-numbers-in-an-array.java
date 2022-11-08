class TrieNode{
    TrieNode zero;
    TrieNode one;
}

class Solution {
        public void insertTrieNode(TrieNode root, int num){
        TrieNode cur = root;

        for (int i = 31; i>=0; i--){
            int value = (num >> i) & 1; //another way of writing this could be num & (1<<i)

            if(value == 0){
                if (cur.zero == null){
                    cur.zero = new TrieNode();
                }
                cur = cur.zero;
            }
            else {
                if (cur.one == null){
                    cur.one = new TrieNode();
                }
                cur = cur.one;
            }
        }
    }
    public int findMaximumXOR(TrieNode root, int num){
        TrieNode cur = root;
        int curMax = 0;

        for (int i = 31; i>=0; i--){
            int value = (num >> i) & 1;

            if(value == 0){
                if (cur.one != null){
                    curMax += (1<<i);
                    cur = cur.one;
                }
                else cur = cur.zero;
            }
//110000
            else {
                if (cur.zero != null){
                    curMax += (1<<i);
                    cur = cur.zero;
                }
                else cur = cur.one;

            }
        }
        return curMax;
    }
    public int findMaximumXOR(int[] nums) {
        
        TrieNode root = new TrieNode();
        int max = 0;
        insertTrieNode(root, nums[0]);

        for (int i = 1; i<nums.length; i++){
            max = Math.max(max, findMaximumXOR(root, nums[i]));
            insertTrieNode(root, nums[i]);
        }

        return max;
    }
}