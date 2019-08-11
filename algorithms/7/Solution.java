class Solution {

    /**
     * Time Complexity: O(n) where n is number of digits.
     *
     * @param x Integer to reverse
     * @return reversed integer
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
