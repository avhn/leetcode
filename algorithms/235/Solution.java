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
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode l, TreeNode r) {
        if (l.val > r.val) return lowestCommonAncestor(root, r, l);

        TreeNode lca = root;
        while (!(l.val <= lca.val && lca.val <= r.val)) {
            if (lca.val < l.val) {
                lca = lca.right;
            } else {  // r.val < lca.val
                lca = lca.left;
            }
        }
        return lca;
    }
}
