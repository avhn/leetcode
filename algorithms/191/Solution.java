public class Solution {

    /**
     * Find hamming weight of the number.
     *
     * Time complexity: O(1).
     * Space complexity: O(1).
     *
     * @param n number
     * @return hamming weight of n
     */
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>= 1;
        }
        return result;
    }
}
