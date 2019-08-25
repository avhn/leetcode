/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    /**
     * Time and space complexity: O(n), where n is size of the binary tree
     */
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return sumOfLeftLeaves(root.right)
                + (isLeave(root.left) ? root.left.val : sumOfLeftLeaves(root.left));
    }

    private boolean isLeave(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
