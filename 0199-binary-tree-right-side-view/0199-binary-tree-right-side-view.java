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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        if (root == null){
            return ans;
        }
        
        
        solveRightSideView(root,ans, 0);
        
        return ans;
    }
    
    public void solveRightSideView(TreeNode curNode, List<Integer> ans, int curDepth){
        
        if (curNode == null){
            return;
        }
        
        if (curDepth == ans.size()){
            ans.add(curNode.val);
        }
        
        solveRightSideView(curNode.right, ans, curDepth +1);
        solveRightSideView(curNode.left, ans, curDepth +1);
    }
}