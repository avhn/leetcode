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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    /**
     * Create height-balanced subtrees between and including left and right recursively.
     */
    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left == right) return new TreeNode(nums[left]);
        else if (right < left) return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }
}
