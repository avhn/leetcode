class Solution {

    /**
     * Find if the binary tree is symmetric.
     *
     * Time complexity: O(n), where n is size of the binary tree.
     * Space complexity: O(n).
     *
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     *
     * @param root binary tree
     * @return boolean indicating whether binary tree is symmetric
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