class Solution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    /**
     * Time Complexity: O(n) where n is length of haystack
     * Space complexity: O(m), where m is length of needle
     */
    private static int knuthMorrisPratt(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();
        if (M == 0) return 0;
        else if (N == 0) return -1;

        int[] lps = buildLps(needle);
        for (int i = 0, j = 0; i < N; ) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == M) {
                // overflow, found
                return i - j;
            } else if (i < N && haystack.charAt(i) != needle.charAt(j)) {
                // mismatch, update j
                if (j > 0) j = lps[j - 1];
                else i++;
            }
        }
        return -1;
    }

    /**
     * Helper method for KMP.
     */
    private static int[] buildLps(String pattern) {
        int[] lps = new int[pattern.length()];
        for (int length = 0, i = 1; i < pattern.length(); ) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else if (length > 0) {
                length = lps[length - 1];
            } else {
                lps[i] = length;
                i++;
            }
        }
        return lps;
    }

    /**
     * Time complexity:
     *      T(r * m), where r is number of hash matches and m is length of substring
     *      O(n * m), where m and n are length of strings
     * Space complexity: O(1)
     */
    private static int rabinKarp(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;

        int len = needle.length();
        int sum = 0;
        int currentSum = 0;
        int location, i;
        for (int m = 0; m < haystack.length(); m++) {
            currentSum += (int) haystack.charAt(m);
            if (m > len - 1) currentSum -= (int) haystack.charAt(m - len);
            else sum += (int) needle.charAt(m);

            if (currentSum == sum && m >= len - 1 ) {
                location = m - len + 1;
                for (i = 0; i < len; i++) {
                    if (needle.charAt(i) != haystack.charAt(location + i)) break;
                } if (i == len) return location;
            }
        }
        return -1;
    }
}
