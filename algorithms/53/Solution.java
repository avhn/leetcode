import java.lang.Math;

class Solution {

    public int maxSubArray(int[] nums) {
        return dp(nums);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
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
     * Time complexity: O(nlog n)
     * Space complexity: O(log n)
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
