import java.util.HashMap;

class Solution {

    /**
     * Not only ASCII encoding, match any Character.
     *
     * Time and space complexity: O(n)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Integer count : map.values()) {
            if (count != 0) return false;
        }
        return true;
    }
}



