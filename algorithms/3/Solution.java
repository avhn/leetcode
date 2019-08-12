import java.util.HashMap;

class Solution {

    /**
     * Time and space complexity: O(n), where n is length of the String
     */
    public Integer lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashTable = new HashMap<>();
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
