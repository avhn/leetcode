class Solution {

    /**
     * Find if the two trees are identical.
     *
     * Time complexity: O(n), where n is the size of the smaller tree.
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
     * @param p binary tree
     * @param q binary tree
     * @return boolean indicating whether p is identical to q
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        else return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
