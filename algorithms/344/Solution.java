class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void reverseString(char[] s) {
        char swapElement;
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            swapElement = s[i];
            s[i] = s[j];
            s[j] = swapElement;
        }
    }
}
