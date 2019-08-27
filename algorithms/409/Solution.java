import java.util.HashMap;

class Solution {

    /**
     * Time complexity: O(n), where n is length of s
     * Space complexity: O(m), where m is number of different characters in s
     */
    public int longestPalindrome(String s) {
        int len = 0;
        HashMap<Character, Integer> numberOfOccurrences = new HashMap<>();
        for (char c : s.toCharArray()) {
            numberOfOccurrences.put(c, numberOfOccurrences.getOrDefault(c, 0) + 1);
        }
        boolean oddCharIncluded = false;
        for (int c : numberOfOccurrences.values()) {
            len += c % 2 == 0 ? c : c - 1;
            if (!oddCharIncluded && c % 2 == 1) {
                len += 1;
                oddCharIncluded = true;
            }
        }
        return len;
    }
}
