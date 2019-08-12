class Solution {

    /**
     * Time complexity: O(n), where n is number of digits in the decimal number
     * Space complexity: O(1)
     */
    public int reverse(int x) {
        double result = 0;
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }

}
