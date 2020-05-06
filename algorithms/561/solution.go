package main

// Time complexity, O(n) where n is size of the array
// Space complexity, O(1)
// Used a lookup table since allowed input interval is narrow
func arrayPairSum(nums []int) int {
	counts := make([]int, 20001)
	for _, n := range nums {
		counts[n+10000]++
	}
	var sum int
	add := true
	for i, _ := range counts {
		for 0 < counts[i] {
			if add {
				sum += i - 10000
			}
			counts[i]--
			add = !add
		}
	}
	return sum
}
