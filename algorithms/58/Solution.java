class Solution {

    /**
     * Find length of the last word.
     *
     * Time complexity: O(n), where n is length of the string.
     * Space complexity: O(1).
     *
     * @param s String
     * @return length of the last word
     */
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i = s.length() - 1; 0 <= i; i--) {
            if (s.charAt(i) == ' ') return (s.length() - 1) - i;
        }
        return s.length();  // no more than one word
    }
}
