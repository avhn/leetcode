import java.util.HashMap;

class Solution {

    public char findTheDifference(String s, String t) {
        return withXOR(s, t);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    private char withXOR(String s, String t) {
        long diff = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            diff ^= s.charAt(i);
            diff ^= t.charAt(i);
        }
        return (char) diff;
    }

    /**
     * Time and space complexity: O(n)
     */
    private char withHashMap(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return c;
            else map.put(c, map.get(c) - 1);
        }
        return 0;
    }
}
