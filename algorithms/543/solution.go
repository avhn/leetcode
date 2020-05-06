package main

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

// Time and space complexity, O(n) where n is size of the tree
func diameterOfBinaryTree(root *TreeNode) int {
	_, res := diameter(root)
	return res
}

// Return (depth, proposed result)
func diameter(root *TreeNode) (int, int) {
	if root == nil {
		return 0, 0
	}
	l, lr := diameter(root.Left)
	r, rr := diameter(root.Right)
	depth := l
	if depth < r {
		depth = r
	}
	depth++
	pr := l + r
	if pr < lr {
		pr = lr
	}
	if pr < rr {
		pr = rr
	}
	return depth, pr
}
