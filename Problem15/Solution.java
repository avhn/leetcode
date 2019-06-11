import java.util.*;


class Solution {

    /**
     * Time Complexity: O(n^2).
     *
     * @param nums array of integers to examine
     * @return list of lists contains three decimal numbers and no dublicates
     * @see java.util.List
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int i, li, ri, sum; // li = left index, ri = left index

        for (i = 0; i < nums.length - 2; i++) {
            // skip dublicates after the first one
            if (i == 0 || nums[i - 1] != nums[i]) {
                li = i + 1;
                ri = nums.length - 1;

                while (li < ri) {
                    sum = nums[i] + nums[li] + nums[ri];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                        while (li < ri && nums[li] == nums[li + 1]) li++; // skip dublicates
                        li++;
                    }
                    else if (sum < 0) li++;
                    else ri--;
                }
            }
        }
        return result;

    }
}