package main

// Time complexity, O(N)
// Space complexity, O(1)
func fib(N int) int {
	if N == 0 {
		return 0
	} else if N < 3 {
		return 1
	}
	var res int
	for f, s, i := 1, 1, 3; i <= N; i++ {
		res = f + s
		f, s = s, res
	}
	return res
}
