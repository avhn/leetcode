class Solution {

    /**
     * Time and space complexity: O(1)
     */
    public String toHex(int n) {
        StringBuilder result = new StringBuilder();
        do {
            result.append(toHexDigit(n & 15)); // 1111 = 15, get 4 rightmost bits
            n >>>= 4;
            // >>> is zero filled right shift, >> keeps sign preserved
            // for example, smallest number in the range has one left padded 1
            // and rest is 0s. Leftmost bit determines the sign of the number,
            // according to completion of any number.
        } while (n != 0);
        return result.reverse().toString();
    }

    /** Converts numbers lower than 16 to a char. */
    private char toHexDigit(int n) {
        return (char) (n < 10 ? '0' + n : 'a' + n % 10);
    }
}
