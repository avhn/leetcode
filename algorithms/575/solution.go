package main

// Time and space complexity, O(n) where n is size of candies
func distributeCandies(candies []int) int {
	l := len(candies)
	h := l / 2
	res := make(map[int]bool, h)
	for i := 0; i < l && len(res) < h; i++ {
		if !res[candies[i]] {
			res[candies[i]] = true
		}
	}
	return len(res)
}
