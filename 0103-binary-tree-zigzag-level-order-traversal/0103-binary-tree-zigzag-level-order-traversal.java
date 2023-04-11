/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        
        if (root == null) {
            return wrapList;
        }
        
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean leftToRight = true;
        
        while (!que.isEmpty()) {
            int size = que.size();
            
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = que.poll();

                if (leftToRight) {
                    subList.add(temp.val);
                }
                else {
                    subList.add(0, temp.val);
                }

                if (temp.left != null) {
                    que.offer(temp.left);
                }
                if (temp.right != null) {
                    que.offer(temp.right);
                } 
            }
            leftToRight = !leftToRight;
            wrapList.add(subList);
        }
        
        return wrapList;
    }
}