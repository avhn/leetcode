package main

import (
	"fmt"
	"strings"
)

// Time and space complexity, O(n) where n is the length of the characters in array
func findWords(words []string) []string {
	var rows = []string{"qwertyuiop", "asdfghjkl", "zxcvbnm"}
	var result []string
	for _, word := range words {
		lowerCaseWord := strings.ToLower(word)
		for _, row := range rows {
			legit := true
			for _, r := range lowerCaseWord {
				if !strings.Contains(row, fmt.Sprintf("%c", r)) {
					legit = false
					break
				}
			}
			if legit {
				result = append(result, word)
				break
			}
		}
	}
	return result
}
