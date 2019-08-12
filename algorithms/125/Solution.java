class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if      (!Character.isLetterOrDigit(s.charAt(l))) l++;
            else if (!Character.isLetterOrDigit(s.charAt(r))) r--;
            else if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) {
                return false;
            }
        }
        return true;
    }
}
