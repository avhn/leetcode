package main

import "strings"

// Time and space complexity, O(n) where n is length of the string
func reverseStr(s string, k int) string {
	var sb strings.Builder
	l := len(s)
	for i := 0; i < l; {
		if l < i+k {
			k = l - i
		}
		for j := i + k - 1; i <= j; j-- {
			sb.WriteByte(s[j])
		}
		e := i + 2*k
		if l < e {
			e = l
		}
		sb.WriteString(s[i+k : e])
		i = e
	}
	return sb.String()
}
