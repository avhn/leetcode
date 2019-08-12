class Solution {

    /**
     * Time complexity: O(n) where n is number of digits in the decimal number
     * Space complexity: O(1)
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
