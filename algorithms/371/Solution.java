class Solution {

    /**
     * Add two numbers using bitwise operators with two's complement.
     *
     * Time and space complexity: O(1)
     */
    public int getSum(int a, int b) {
        return recursiveGetSum(a, b);
    }

    private int recursiveGetSum(int a, int b) {
        return b == 0 ? a : recursiveGetSum(a ^ b, (a & b) << 1);
    }

    private int iterativeGetSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
