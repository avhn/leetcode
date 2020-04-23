package main

import "strings"

// Time complexity, O(n) where n is length of S
// Space complexity, O(1)
func licenseKeyFormatting(S string, K int) string {
	sep := "-"
	S = strings.ToUpper(strings.Replace(S, sep, "", -1))
	firstKeyLen := len(S) % K
	if firstKeyLen == 0 && 0 < len(S) {
		firstKeyLen = K
	}
	var builder strings.Builder
	builder.WriteString(S[:firstKeyLen])
	for i := firstKeyLen; i < len(S); i += K {
		builder.WriteString(sep)
		builder.WriteString(S[i : i+K])
	}
	return builder.String()
}
