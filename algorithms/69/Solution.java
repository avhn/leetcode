class Solution {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public int mySqrt(int n) {
        long left = 1;
        long right = n;
        long mid = (left + right) / 2;
        while (!(mid * mid <= n && n < (mid + 1) * (mid + 1))) {
            if (n < mid * mid) {
                right = mid;
            } else {
                left = mid;
            }
            mid = (left + right) / 2;
        }
        return (int) mid;
    }
}
