// Time and space complexity: O(1)
func hammingDistance(x int, y int) int {
	var result int
	xor := x ^ y
    for xor != 0 {
		if xor & 1 == 1 {
			result += 1
		}
		xor >>= 1
	}
	return result
}
