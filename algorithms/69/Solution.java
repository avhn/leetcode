class Solution {

    /**
     * Find sqrt with binary search method.
     *
     * Time complexity: O(log n), where n is the given number.
     * Space complexity: O(1).
     *
     * @param x decimal
     * @return rounded value of square root of x
     */
    public int mySqrt(int x) {
        long left = 1;
        long right = x;
        long mid = (left + right) / 2;

        while (!(mid * mid <= x && x < (mid + 1) * (mid + 1))) {
            if (x < mid * mid) {
                right = mid;
            } else {
                left = mid;
            }
            mid = (left + right) / 2;
        }
        return (int) mid;
    }
}