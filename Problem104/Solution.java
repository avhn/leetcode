import java.lang.Math;

class Solution {

    /**
     * Find max depth of the given binary tree.
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
     *
     * @param root binary tree
     * @return depth of the given binary tree
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}