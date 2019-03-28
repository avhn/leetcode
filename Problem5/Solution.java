class Solution {

    /**
     * Find longest palindrome's length as expanding from center at given index/es.
     * Time complexity: O(n).
     *
     * @param s String to expand on
     * @param left index to expand to left
     * @param right index to expand to right
     * @return length of longest palindrome
     */
    private int expand(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;

    }

    /**
     * Find longest palindrome at given String.
     *
     * Time complexity: O(n^2).
     * Runtime: 6 ms, faster than 99.19% of Java online submissions for Longest Palindromic Substring.
     * Memory Usage: 37.4 MB, less than 92.96% of Java online submissions for Longest Palindromic Substring.
     *
     * @param s String to find longest palindrome
     * @return longest palindrome in s
     * @see String
     */
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0, len, oddLength, evenLength;
        for (int i = 0; i < s.length(); i++) {
            oddLength = expand(s, i, i);
            evenLength = expand(s, i, i + 1);
            len = Math.max(oddLength, evenLength);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
}