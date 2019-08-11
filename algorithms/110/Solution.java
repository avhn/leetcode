import java.lang.Math;

class Solution {

    /**
     * Find if given binary tree is balanced.
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
     * @return boolean indicating whether binary tree is balanced or not
     */
    public boolean isBalanced(TreeNode root) {
        return balancedMaxDepth(root) != null;
    }

    /**
     * Using DFS recursion, return max height of the
     * balanced tree; if tree is not balanced, return null.
     */
    private Integer balancedMaxDepth(TreeNode root) {
        if (root == null) return 0;
        Integer left = balancedMaxDepth(root.left);
        Integer right = balancedMaxDepth(root.right);
        if (left == null || right == null || Math.abs(left - right) > 1) {
            return null;
        } else return 1 + Math.max(left, right);
    }
}