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

// Time and space complexity: O(n) where n is size of the bigger tree
func isSubtree(s *TreeNode, t *TreeNode) bool {
	return s != nil &&
		(isSame(s, t) || isSubtree(s.Left, t) || isSubtree(s.Right, t))
}
