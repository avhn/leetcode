package main

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func isSame(s *TreeNode, t *TreeNode) bool {
	return s == nil && t == nil ||
		s != nil && t != nil && s.Val == t.Val &&
			isSame(s.Left, t.Left) && isSame(s.Right, t.Right)
}

// Time complexity, O(n*m) where n and m are length of the trees and m <= n
// Space complexity, O(n)
func isSubtree(s *TreeNode, t *TreeNode) bool {
	return s != nil &&
		(isSame(s, t) || isSubtree(s.Left, t) || isSubtree(s.Right, t))
}
