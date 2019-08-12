import java.util.*;

class Solution {

    /**
     * Time complexity: O(n^3), where n is length of the array
     * Space complexity: O(n), note that every value is unique in the array
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        int len = nums.length;
        for (int a = 0; a < len - 3;  a++) {
            // duplicate
            if (a > 0 && nums[a - 1] == nums[a]) continue;
            // too small
            if (nums[a] + nums[len - 3] + nums[len - 2] + nums[len - 1] < target) continue;

            for (int b = a + 1; b < len - 2; b++) {
                // duplicate
                if (b > a + 1 && nums[b - 1] == nums[b]) continue;
                // too big
                if (nums[a] + nums[b] + nums[b + 1] + nums[b + 2] > target) break;
                // too small
                if (nums[a] + nums[b] + nums[len - 2] + nums[len - 1] < target) continue;

                // li = left index, ri = right index
                int li = b + 1;
                int ri = len - 1;
                while (li < ri) {
                    int diff = nums[a] + nums[b] + nums[li] + nums[ri] - target;
                    if (diff == 0) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[li], nums[ri]));

                        while (li < ri && nums[li] == nums[li + 1]) li++;
                        while (li < ri && nums[ri - 1] == nums[ri]) ri--;
                        li++; ri--;
                    } else if (diff < 0) {
                        while(li < ri && nums[li] == nums[li + 1]) li++;
                        li++;
                    } else {
                        while (li < ri && nums[ri - 1] == nums[ri]) ri--;
                        ri--;
                    }
                }
            }
        }
        return result;
    }
}
