package main

// Time and space complexity, O(r*c)
func matrixReshape(nums [][]int, r int, c int) [][]int {
	if len(nums)*len(nums[0]) != r*c {
		return nums
	}

	matrix := make([][]int, r)
	matrix[0] = make([]int, c)
	rr, cc := len(nums), len(nums[0])
	for i, j, ii := 0, 0, 0; ii < rr; ii++ {
		for jj := 0; jj < cc; jj++ {
			if j == c {
				i++
				matrix[i] = make([]int, c)
				j = 0
			}
			matrix[i][j] = nums[ii][jj]
			j++
		}
	}
	return matrix
}
