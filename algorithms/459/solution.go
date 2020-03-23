// Check if string is repeated by a substring pattern
// Time complexity: O(nlogn), where n is length of the string
// Space complexity: O(1)
func repeatedSubstringPattern(s string) bool {
	totalLen := len(s)
	repeated := false
	for parts := 2; !repeated && parts <= totalLen; parts++ {
		if totalLen%parts != 0 {
			continue
		}
		subLen := totalLen / parts
		pattern := s[:subLen]
		repeated = true
		for end := subLen * 2; end <= totalLen; end += subLen {
			if pattern != s[end-subLen:end] {
				repeated = false
				break
			}
		}
	}
	return repeated
}
