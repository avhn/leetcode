class Solution {
    public int strStr(String haystack, String needle) {
        return rabinKarp(haystack, needle);
    }

    /**
     * Time Complexity:
     *      T(r * m), where r is number of hash matches and m is length of substring.
     *      O(n * m), where m and n are length of strings.
     * Runtime: 2 ms, faster than 81.49% of Java online submissions for Implement strStr().
     * Memory Usage: 35.2 MB, less than 98.52% of Java online submissions for Implement strStr().
     *
     * @param haystack String to be searched
     * @param needle String to search in haystack
     * @return starting index of found substring or -1
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
