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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        
        Queue<TreeNode> container =  new LinkedList<>();
        
        
        if (root == null){
            return ans;
        }
        container.add(root);
        
        while (!container.isEmpty()){
            int container_size = container.size();
            
            List<Integer> cur_row = new LinkedList<Integer>();
            
            for (int i =1; i<=container_size; i++){
                TreeNode temp = container.poll();
                
                cur_row.add(temp.val);
                
                if (temp.left != null){
                    container.add(temp.left);
                }
                
                if (temp.right != null){
                    container.add(temp.right);
                }
            }
            
            ans.add(cur_row);
        }
        
        return ans;
        
    }
}