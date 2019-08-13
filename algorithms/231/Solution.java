class Solution {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        while ((n & 1) != 1) {
            n >>= 1;
        }
        return n == 1;
    }
}
