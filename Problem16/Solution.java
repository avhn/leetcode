import java.util.Arrays;


class Solution {

    /**
     * Time complexity: O(n^2).
     * Runtime: 7 ms, faster than 98.49% of Java online submissions for 3Sum Closest.
     * Memory Usage: 37.8 MB, less than 68.81% of Java online submissions for 3Sum Closest.
     *
     * @param nums an array of ints to work on
     * @param target int
     * @return the closest sum to target
     * @see Integer
     */
    public Integer threeSumClosest(int[] nums, int target) {

        // li = lower index, hi = higher index
        int diff = Integer.MAX_VALUE, li, hi;
        Integer result = null;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            li = i + 1;
            hi = nums.length - 1;

            while (li < hi) {
                int value = nums[i] + nums[li] + nums[hi];
                int new_diff = value - target;

                // Move indexes
                if (new_diff < 0) li++;
                else hi--;

                // Compare new values
                if (new_diff == 0) return value;
                if (new_diff < 0) new_diff *= -1;
                if (new_diff < diff) {
                    diff = new_diff;
                    result = value;
                }
            }
        }
        
        return result;
    }
}
