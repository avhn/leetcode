class Solution {

    /**
     * Find if given binary tree has a path sum ending with a leaf.
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
     * @param sum to find in root
     * @return boolean indicating whether binary tree has a path sum with sum.
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right == null) return sum == 0;
        else return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}