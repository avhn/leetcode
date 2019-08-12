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
