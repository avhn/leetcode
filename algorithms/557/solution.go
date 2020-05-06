package main

import "strings"

// Time and space complexity, O(n) where n is length of the string
func reverseWords(s string) string {
	var sb strings.Builder
	l := len(s)
	for i, j := 0, 0; j <= l; j++ {
		// check end of word
		if j < l && s[j] != ' ' {
			continue
		}
		// reverse
		for jj := j - 1; i <= jj; jj-- {
			sb.WriteByte(s[jj])
		}
		if j < l {
			sb.WriteRune(' ')
		}
		j++
		i = j
	}
	return sb.String()
}
