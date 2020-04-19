// Time complexity: O(m*n) where m and n are dimensions of the matrix
// Space complexity: O(1)
func islandPerimeter(grid [][]int) int {
	var result int
	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[i]); j++ {
			if grid[i][j] == 1 {
				if j == 0 || grid[i][j-1] == 0 { // left
					result++
				}
				if j == len(grid[i])-1 || grid[i][j+1] == 0 { // right
					result++
				}
				if i == len(grid)-1 || grid[i+1][j] == 0 { // down
					result++
				}
				if i == 0 || grid[i-1][j] == 0 { // up
					result++
				}
			}
		}
	}
	return result
}
