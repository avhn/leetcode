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
     * Time and space complexity: O(n), where n is the size of the smaller tree
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        else return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
