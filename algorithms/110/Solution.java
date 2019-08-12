import java.lang.Math;

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
    public boolean isBalanced(TreeNode root) {
        return balancedMaxDepth(root) != null;
    }

    /**
     * Using DFS recursion, return max height of the balanced tree; if tree is not balanced, return null.
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
