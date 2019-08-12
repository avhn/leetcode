import java.util.Collections;

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
