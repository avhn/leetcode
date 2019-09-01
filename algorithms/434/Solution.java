class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
                while (++i < s.length() && s.charAt(i) != ' ');
            }
        }
        return count;
    }
}
