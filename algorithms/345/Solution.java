import java.util.HashSet;

class Solution {
    private final HashSet<Character> vowels = new HashSet<Character>() {{
        for (char c : "aeiouAEIOU".toCharArray()) {
            add(c);
        }
    }};

    /**
     * Time and space complexity: O(n)
     */
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && notVowel(array[i])) i++;
            while (i < j && notVowel(array[j])) j--;
            if (i < j) {
                char swapElement = array[i];
                array[i] = array[j];
                array[j] = swapElement;
            }
        }
        return String.valueOf(array);
    }

    private boolean notVowel(char c) {
        return !vowels.contains(c);
    }
}
