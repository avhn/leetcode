import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
     * Algorithm's time complexity is O(n).
     *
     * LeetCode statistics:
     * - Runtime: 3 ms, faster than 99.36% of Java online submissions for Two Sum.
     * - Memory Usage: 39 MB, less than 27.71% of Java online submissions for Two Sum.
     */

    public int[] twoSum(int[] nums, int target) {

        // Map <number, index>
        Map<Integer, Integer> hashTable = new HashMap<>();
        int diff;

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (hashTable.containsKey(diff)){
                return new int[]{hashTable.get(diff), i};
            }

            hashTable.put(nums[i], i);
        }

        return null;
    }
}