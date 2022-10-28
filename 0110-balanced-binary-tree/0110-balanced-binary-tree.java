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
    boolean checkBalanced = true;
    public boolean isBalanced(TreeNode root) {
        checkBalanced = true;
        
        isBalancedHelper(root);
        return checkBalanced;
    }
    
    int isBalancedHelper(TreeNode root){
        if (root == null){
            return -1;
        }
        
        if (checkBalanced == false){
            return 1; //pruning - unnecessary to go beyond this
        }
        
        int leftHeight = isBalancedHelper(root.left);
        int rightHeight = isBalancedHelper(root.right);
        
        if (Math.abs(leftHeight - rightHeight) > 1){
            checkBalanced = false;
        }
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
}