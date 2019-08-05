import java.util.Collections;

class Solution {

    /**
     * Return binary tree's levels as list of lists in reverse order.
     *
     * Time complexity: O(n), where n is size of the binary tree.
     * Space complexity: O(n).
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
     * @param root binary tree
     * @return List of Lists representing levels of binary tree
     * @see List
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        levelOrderBottom(root, 1, result);
        Collections.reverse(result);
        return result;
    }

    /**
     * Compute result when invoked from public method.
     */
    private void levelOrderBottom(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) return;
        if (list.size() < level) list.add(new ArrayList<Integer>());

        levelOrderBottom(root.left, level + 1, list);
        levelOrderBottom(root.right, level + 1, list);
        list.get(level - 1).add(root.val);
    }
}
