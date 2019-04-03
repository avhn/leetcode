class Solution {

    /**
     * Time Complexity: O(S), where S is total number of characters in the array.
     * Runtime: 1 ms, faster than 97.15% of Java online submissions for Longest Common Prefix.
     * Memory Usage: 37.5 MB, less than 76.47% of Java online submissions for Longest Common Prefix.
     *
     * @param strs array of String objects
     * @return longest common prefix of the array
     * @see String
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        boolean Continue = true;
        Character current;
        int i = 0;
        while (Continue) {
            current = null;

            for (String str : strs) {
                if (i == str.length()) {
                    Continue = false;
                    break;
                }
                else if (current == null) current = str.charAt(i);
                else if (current == str.charAt(i)) continue;
                else {
                    Continue = false;
                    break;
                }
            }
            i++;
        }
        return strs[0].substring(0, i - 1);
    }
}
