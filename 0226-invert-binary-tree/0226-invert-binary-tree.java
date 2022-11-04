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
    public TreeNode invertTree(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
            TreeNode temp = q.remove();

            if (temp!=null){
                q.add(temp.left);
                q.add(temp.right);

                TreeNode tempNode = temp.left;
                temp.left = temp.right;
                temp.right = tempNode;

                // int NodeValue = temp.left.val;
                // temp.left.val = temp.right.val;
                // temp.right.val = NodeValue;
            }
        }

        return root;
    }
}