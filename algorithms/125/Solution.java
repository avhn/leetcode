class Solution {

    /**
     * Check if given String is palindrome regarding only alphanumeric characters.
     *
     * Time complexity: O(n), where n is length of the String.
     * Space complexity: O(n).
     *
     * @param s String
     * @return boolean indicating whether given String is a palindrome
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


