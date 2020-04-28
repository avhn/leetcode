package main

import "unicode"

type verifier func(rune) bool

// Verify every rune in string with the verifier
func verify(s string, f verifier) bool {
	for _, r := range s {
		if !f(r) {
			return false
		}
	}
	return true
}

// Time and space complexity, O(n) where n is length of the word
func detectCapitalUse(word string) bool {
	if verify(word[:1], unicode.IsUpper) {
		return verify(word, unicode.IsUpper) || verify(word[1:], unicode.IsLower)
	} else {
		return verify(word, unicode.IsLower)
	}
}
