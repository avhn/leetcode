package main

// Time and space complexity, O(1)
func bitwiseComplement(N int) int {
	if N == 0 {
		return 1
	}
	var c int
	for m := 1; N != 0; m, N = m<<1, N>>1 {
		if N&1 != 1 {
			c += m
		}
	}
	return c
}
