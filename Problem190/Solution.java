public class Solution {

    /**
     * Reverse bits of an integer.
     *
     * Time complexity: O(1).
     * Space complexity O(1).
     *
     * @param n number to reverse
     * @return reversed number
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }
}
