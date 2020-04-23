package main

// Time complexity, O(n) where n is length of nums
// Space complexity, O(1)
func findMaxConsecutiveOnes(nums []int) int {
	var max int
	var currMax int
	for _, n := range nums {
		if 0 < n {
			currMax++
		} else {
			// finished streak, update
			if max < currMax {
				max = currMax
			}
			currMax = 0
		}
	}
	if max < currMax {
		// case, len == 1
		max = currMax
	}
	return max
}
