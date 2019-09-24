import java.util.HashMap;
import java.util.Map;

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
     *
     * Use dp<sum, occurrence count> for number of prefixed sums so far.
     * Proof using DFS:
     *  any cached node(current sum - target) -> path -> current node
     *  path + current node == target
     *  paths summed up to target ending with current node == number of (current sum - target) in dp
     */
    public int pathSum(TreeNode root, int target) {
        return pathSum(root, 0, target, new HashMap<Integer, Integer>(){{
            put(0, 1); // sum - target = 0, node's itself
        }});
    }

    private int pathSum(TreeNode node, int sum, int target, Map<Integer, Integer> dp) {
        if (node == null) {
            return 0;
        }
        sum += node.val;
        int result = dp.getOrDefault(sum - target, 0);
        dp.put(sum, dp.getOrDefault(sum, 0) + 1);
        result += pathSum(node.left, sum, target, dp)
                + pathSum(node.right, sum, target, dp);
        dp.put(sum, dp.get(sum) - 1);
        return result;
    }
}
