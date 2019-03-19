import java.util.Map;
import java.util.HashMap;


class Solution {

    /**
     * Time complexity: O(n).
     * Runtime: 20 ms, faster than 88.74% of Java online submissions for Longest Substring Without Repeating Characters.
     * Memory Usage: 39.1 MB, less than 23.93% of Java online submissions for Longest Substring Without Repeating Characters.
     *
     * @param s String to examine
     * @return length of longest non-recurring substring
     * @see Integer
     */
    public Integer lengthOfLongestSubstring(String s) {

        Map<Character, Integer> hashTable = new HashMap<>();
        int i = 0, j = 0, len = 0;

        while (j < s.length()) {
            if (hashTable.containsKey(s.charAt(j))) {
                // slide i
                i = Math.max(i, hashTable.get(s.charAt(j)) + 1);
            }

            hashTable.put(s.charAt(j), j++);

            // sliding window indexes, [i, j)
            if (len < j - i) len = j - i;
        }

        return len;
    }
}
