class Solution {

    /**
     * Find how many trailing zeroes n factorial has.
     *
     * Time complexity: O(log n).
     * Space complexity: O(log n).
     *
     * @param n factorial number
     * @return number of trailing zeroes
     */
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
