
import java.util.HashMap;

class Solution {

    /**
     * Time and space complexity: O(n), where n is length of the strings
     */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();    // map s to t
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) || map.containsValue(t.charAt(i))) {
                if (map.getOrDefault(s.charAt(i), null) != (Character) t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
