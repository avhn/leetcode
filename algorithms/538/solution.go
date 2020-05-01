package main

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

// Time complexity, O(n) where n is size of the tree
// Space complexity, O(1)
func convertBST(root *TreeNode) *TreeNode {
	var tempSum int
	reverseInorder(root, &tempSum)
	return root
}

// Form the greater tree recursively
func reverseInorder(root *TreeNode, sum *int) {
	if root == nil {
		return
	}
	reverseInorder(root.Right, sum)
	*sum += root.Val
	root.Val = *sum
	reverseInorder(root.Left, sum)
}
