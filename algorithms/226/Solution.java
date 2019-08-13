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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);
        invertTree(root.right);

        TreeNode left = root.left;  // swap element
        root.left = root.right;
        root.right = left;
        return root;
    }
}
