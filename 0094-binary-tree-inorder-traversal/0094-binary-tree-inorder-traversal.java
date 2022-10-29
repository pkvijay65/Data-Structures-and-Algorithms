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
    void inOrder(TreeNode root, List<Integer> ans){
        if (root == null){
            return;
        }
        
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        inOrder(root, ans);
        
        return ans;
        
        

//         Stack<TreeNode> st = new Stack<TreeNode>();
//         TreeNode curNode = root;

//         while (!st.isEmpty() || curNode != null ){
//             if (curNode != null){
//                 st.push(curNode);
//                 curNode = curNode.left;
//             }
//             else {
//                 curNode = st.pop();
//                 ans.add(curNode.val);
//                 curNode = curNode.right;
//             }
//         }

//         return ans;
        
    }
}