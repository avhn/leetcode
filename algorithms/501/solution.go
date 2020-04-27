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
func findMode(root *TreeNode) []int {
	freqs := make(map[int]int)
	depthFirstCount(root, freqs)
	var max int
	var result []int
	for k, v := range freqs {
		if max < v {
			max = v
			result = []int{k}
		} else if max == v {
			result = append(result, k)
		}

	}
	return result
}

// Aggregate frequencies to a map
func depthFirstCount(root *TreeNode, f map[int]int) {
	if root != nil {
		f[root.Val]++
		depthFirstCount(root.Left, f)
		depthFirstCount(root.Right, f)
	}
}
