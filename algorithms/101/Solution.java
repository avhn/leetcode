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
     * Time and space complexity: O(n)
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return isSameMirrored(root.left, root.right);
    }

    /**
     * Helper recursive method for isSymmetric.
     */
    private boolean isSameMirrored(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        else return p.val == q.val && isSameMirrored(p.left, q.right) && isSameMirrored(p.right, q.left);
    }
}