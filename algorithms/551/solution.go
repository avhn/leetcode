package main

// Time complexity, O(n) where n is length of string
// Space complexity, O(1)
func checkRecord(s string) bool {
	var absent bool
	for i, r := range s {
		switch r {
		case 'L':
			if i < 2 {
				continue
			}
			prev := s[i-2 : i]
			if prev[0] == 'L' && prev[1] == 'L' {
				return false
			}
		case 'A':
			if absent {
				return false
			}
			absent = true
		}
	}
	return true
}
