package main

// Time complexity, O(n), where n is the length of a string when len(a) == len(b)
// Space complexity, O(1)
func findLUSlength(a string, b string) int {
	if a == b {
		return -1
	} else if len(b) < len(a) {
		return len(a)
	} else {
		return len(b)
	}
}
