class Solution {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
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

    private int expand(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}