import java.util.*;

class Solution {

    /*
     * Algorithm's time complexity is O(n) with sliding window technique.
     *
     * LeetCode statistics:
     * - Runtime: 21 ms, faster than 85.68% of Java online submissions for Longest Substring Without Repeating Characters.
     * - Memory Usage: 39 MB, less than 25.11% of Java online submissions for Longest Substring Without Repeating Characters.
     */

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> hashTable = new HashMap<>();
        int i = 0, j = 0, len = 0;

        while (j < s.length()) {
            if (hashTable.containsKey(s.charAt(j))) {
                i = Math.max(i, hashTable.get(s.charAt(j)) + 1);
            }

            hashTable.put(s.charAt(j), j++);

            // sliding window indexes, [i, j)
            if (len < j - i) len = j - i;
        }

        return len;
    }
}
