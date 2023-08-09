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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumGain(root);
        return maxSum;
    }

    private int maxPathSumGain(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftGain = Math.max(maxPathSumGain(root.left), 0);
        int rightGain = Math.max(maxPathSumGain(root.right), 0);

        int newSum = root.val + leftGain + rightGain;
        maxSum = Math.max(newSum, maxSum);

        return root.val + Math.max(leftGain, rightGain);
    }
}