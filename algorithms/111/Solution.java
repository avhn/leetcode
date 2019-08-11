class Solution {

    /**
     * Find minimum depth of the binary tree.
     *
     * Time complexity: O(n), where n is the size of the binary tree.
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
     * @return minimum depth of the binary tree
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else {
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            int min = (0 < left && (left < right || right == 0)) ? left : right;
            return 1 + min;
        }
    }
}
