import java.util.ArrayList;
import java.util.List;

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
    private final String arrow = "->";

    /**
     * Time and space complexity: O(n)
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePaths(root, "", paths);
        return paths;
    }

    private void binaryTreePaths(TreeNode root, String path, List<String> paths) {
        if (root == null) return;
        path += root.val;
        if (root.left == null && root.right == null) paths.add(path);
        else {
            binaryTreePaths(root.left, path + arrow, paths);
            binaryTreePaths(root.right, path + arrow, paths);
        }
    }
}
