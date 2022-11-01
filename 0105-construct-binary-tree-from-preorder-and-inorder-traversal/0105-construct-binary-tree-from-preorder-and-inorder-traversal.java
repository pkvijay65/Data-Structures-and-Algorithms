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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n1 = preorder.length;
        int n2 = inorder.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i<n2; i++){
            hm.put(inorder[i], i);
        }

        return getTree(preorder, inorder, 0, n1 - 1 , 0, n2 -1, hm);
        
    }
    
     TreeNode getTree(int[] A, int[] B, int preOrderStartingIndex, int preOrderEndingIndex, int inOrderStartingIndex, int inOrderEndingIndex, HashMap<Integer, Integer> hm){
         
        if (preOrderStartingIndex > preOrderEndingIndex || inOrderStartingIndex > inOrderEndingIndex){
            return null;
        }
         
         int rootValue = A[preOrderStartingIndex]; 
         TreeNode root = new TreeNode(rootValue);

         int indexOfRootInOrder = hm.get(rootValue);

         root.left = getTree(A, B, preOrderStartingIndex + 1, preOrderStartingIndex + indexOfRootInOrder - inOrderStartingIndex, inOrderStartingIndex, indexOfRootInOrder -1, hm);
         
         root.right = getTree(A, B, preOrderStartingIndex + indexOfRootInOrder - inOrderStartingIndex +1, preOrderEndingIndex, indexOfRootInOrder + 1, inOrderEndingIndex, hm);
         return root;
    }
}