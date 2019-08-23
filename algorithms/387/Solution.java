import java.util.HashMap;

class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Boolean> isUnique = new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            isUnique.put(c, !isUnique.containsKey(c));
        }

        for (int i = 0; i < s.length(); i++) {
            if (isUnique.get(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
