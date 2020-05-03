package main

// Time and space complexity, O(n) where n is size of the array
func findPairs(nums []int, k int) int {
	if k < 0 {
		return 0
	}
	countMap := make(map[int]int, len(nums))
	for _, n := range nums {
		countMap[n]++
	}
	var c int
	for n, count := range countMap {
		if 0 < k {
			if 0 < countMap[n+k] {
				c++
			}
		} else if 1 < count {
			c++
		}
	}
	return c
}
