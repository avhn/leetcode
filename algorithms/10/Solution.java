class Solution {

    /**
     * Time and space complexity: O(S * P), where S is length of string and P is length of pattern
     */
    public boolean isMatch(String string, String pattern) {
        boolean[][] DP = new boolean[string.length() + 1][pattern.length() + 1];
        DP[string.length()][pattern.length()] = true;

        for (int i = string.length(); -1 < i; i--) {
            for (int j = pattern.length() - 1; -1 < j; j--) {
                boolean match = i < string.length()
                        && (pattern.charAt(j) == string.charAt(i)
                        || pattern.charAt(j) == '.');

                // check if pattern[j:] matches string[i:]
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    DP[i][j] = DP[i][j + 2] || match && DP[i + 1][j];
                } else {
                    DP[i][j] = match && DP[i + 1][j + 1];
                }
            }
        }
        return DP[0][0];
    }
}
