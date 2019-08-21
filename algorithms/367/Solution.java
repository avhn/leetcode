class Solution {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        int left = 0;
        int right = num / 2;
        long mid = right / 2;
        while (left < right && mid * mid != num) {
            if (mid * mid < num) {
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
            mid = left + (right - mid) / 2;
        }
        return mid * mid == num;
    }
}
