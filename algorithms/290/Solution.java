import java.util.HashMap;

class Solution {

    /**
     * Time and space complexity: O(max(m, n)), where m and n are length of the strings
     */
    public boolean wordPattern(String pat, String str) {
        String[] words = str.split(" ");
        // map a char in pat to a word in str
        HashMap<Character, String> map = new HashMap<>();
        int i = 0;  // current index at pattern
        int j = 0;  // current index at words
        String word;
        while(i < pat.length() && j < words.length) {
            word = words[j++];
            if (map.containsKey(pat.charAt(i)) ^ map.containsValue(word)
                || !word.equals(map.getOrDefault(pat.charAt(i), word))) {
                return false;
            } else {
                map.put(pat.charAt(i++), word);
            }
        }
        return i == pat.length() && j == words.length;
    }
}
