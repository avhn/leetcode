package main

// Time and space complexity, O(1)
func findComplement(num int) int {
	var c int
	for m := 1; num != 0; m, num = m<<1, num>>1 {
		if num&1 != 1 {
			c += m
		}
	}
	return c
}
