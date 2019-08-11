import java.lang.Math;

class Solution {

    /**
     * Find the contiguous subarray with maximum sum.
     *
     * @param nums array
     * @return sum of the found subarray
     */
    public int maxSubArray(int[] nums) {
        return dp(nums);
    }

    /**
     * Time complexity: O(n), where n is length of the array.
     * Space complexity: O(1).
     *
     * @param nums array
     * @return sum of the found subarray
     */
    private int dp(int[] nums) {
        int currentMax = nums[0];
        int overallMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            overallMax = Math.max(currentMax, overallMax);
        }
        return overallMax;
    }

    /**
     * Time complexity: O(n*log n).
     * Space complexity: O(log n).
     * Where n is length of the array.
     *
     * @param nums array
     * @param l left index
     * @param r right index
     * @return sum of the subarray with maximum sum between left and right indexes
     */
    private int divideAndConquer(int[] nums, int l, int r) {
        if (r < l) return Integer.MIN_VALUE;
        else if (l == r) return nums[l];

        int mid = l + (r - l) / 2;
        int leftMax = divideAndConquer(nums, l, mid - 1);
        int rightMax = divideAndConquer(nums, mid + 1, r);

        int leftExtends = 0;
        for (int i = mid - 1, sum = 0; i >= l; i--) {
            sum += nums[i];
            leftExtends = Math.max(leftExtends, sum);
        }
        int rightExtends = 0;
        for (int i = mid + 1, sum = 0; i <= r; i++) {
            sum += nums[i];
            rightExtends = Math.max(rightExtends, sum);
        }

        return Math.max(Math.max(leftMax, rightMax), leftExtends + nums[mid] + rightExtends);
    }
}
