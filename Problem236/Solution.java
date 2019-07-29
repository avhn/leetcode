class Solution {

    /**
     * Find LCA of the given binary tree.
     * Given nodes, p and q, considered exist in the tree at initial invocation.
     *
     * Time complexity: O(n), where n is number of the nodes in the binary tree.
     *
     *
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     *
     * @param root TreeNode
     * @param p TreeNode to find in root
     * @param q TreeNode to find in root
     * @return Lowest Common Ancestor of p and q
     * @see TreeNode
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left != null ? (right != null ? root : left) : right;
    }

}
