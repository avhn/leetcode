package main

import (
	"fmt"
	"strings"
)

// Time and space complexity, O(log7(n)), where n is the number
func convertToBase7(num int) string {
	var res strings.Builder
	if num < 0 {
		res.WriteString("-")
		num *= -1
	} else if num == 0 {
		return "0"
	}
	var rd strings.Builder
	for 0 < num {
		remainder := num % 7
		num = (num - remainder) / 7
		rd.WriteString(fmt.Sprintf("%d", remainder))
	}
	reverse := []rune(rd.String())
	for i := len(reverse) - 1; -1 < i; i-- {
		res.WriteRune(reverse[i])
	}
	return res.String()
}
