package main

/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Children []*Node
 * }
 */

// Time and space complexity, O(n) where n is size of the tree
func maxDepth(root *Node) int {
	if root == nil {
		return 0
	}
	var res int
	for _, p := range root.Children {
		c := maxDepth(p)
		if res < c {
			res = c
		}
	}
	return res + 1
}
