class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(m)
     * Where m is length of ransomNote and n is length of magazine
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int lettersToMatch = 0;
        HashMap<Character, Integer> letters = new HashMap<>();
        for (char c : ransomNote.toCharArray()) {
            lettersToMatch++;
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            if (0 < letters.getOrDefault(c, 0)) {
                if (--lettersToMatch == 0) return true;
                letters.put(c, letters.get(c) - 1);
            }
        }
        return lettersToMatch == 0;
    }
}
