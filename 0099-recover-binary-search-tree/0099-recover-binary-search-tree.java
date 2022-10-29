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
    public TreeNode prev = null , firstAnswer, secondAnswer ;
    
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        
        inOrder(root.left);
        
        if (prev != null && prev.val > root.val){
            
            if (firstAnswer == null){
                firstAnswer = prev;
                secondAnswer = root;
            }
            
            else {
                secondAnswer = root;
            }
        } 
        
        prev = root;
        inOrder(root.right);
        
    }
    public void recoverTree(TreeNode root) {
        
        firstAnswer = null;
        secondAnswer = null;
        
        inOrder(root);
        if (firstAnswer != null && secondAnswer != null){
            int temp = firstAnswer.val;
            firstAnswer.val = secondAnswer.val;
            secondAnswer.val = temp;
        }
       
    }
}