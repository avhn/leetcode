package main

import "math"

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
func getMinimumDifference(root *TreeNode) int {
	diff := math.MaxInt64
	var prev *TreeNode
	calcMinDiff(root, &prev, &diff)
	return diff
}

// Calculate min diff for a BST, traverse inorder recursively
func calcMinDiff(root *TreeNode, prev **TreeNode, diff *int) {
	if root != nil {
		calcMinDiff(root.Left, prev, diff)
		if *prev != nil {
			*diff = min(*diff, abs(root.Val-(*prev).Val))
		}
		*prev = root
		calcMinDiff(root.Right, prev, diff)
	}
}

// Min util for int
func min(n1 int, n2 int) int {
	if n1 < n2 {
		return n1
	} else {
		return n2
	}
}

// Abs util for int
func abs(n int) int {
	if n < 0 {
		return -n
	} else {
		return n
	}
}
