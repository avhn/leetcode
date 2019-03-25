class Solution {

    /**
     * Time Complexity: O(n) where n is number of digits.
     * Runtime: 70 ms, faster than 99.35% of Java online submissions for Palindrome Number.
     * Memory Usage: 40.5 MB, less than 62.55% of Java online submissions for Palindrome Number.
     *
     * @param x Integer to check if palindrome
     * @return Boolean indicates if param is palindrome or not
     */
    public boolean isPalindrome(int x) {

        int comp_x = 0, temp_x = x;
        while(temp_x > 0) {
            comp_x *= 10;
            comp_x += temp_x % 10;
            temp_x /= 10;
        }

        return comp_x == x;
    }
}