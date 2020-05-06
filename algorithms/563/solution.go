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
func findTilt(root *TreeNode) int {
	var tilt int
	calcTilt(root, &tilt)
	return tilt

}

// Returns sum of the nodes and updates the tilt
func calcTilt(root *TreeNode, tilt *int) int {
	if root == nil {
		return 0
	}
	l := calcTilt(root.Left, tilt)
	r := calcTilt(root.Right, tilt)
	t := l - r
	if t < 0 {
		t *= -1
	}
	*tilt += t
	return l + root.Val + r
}
