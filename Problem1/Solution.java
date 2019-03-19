import java.util.HashMap;
import java.util.Map;

class Solution {

    /**
     * Time complexity: O(n).
     * Runtime: 3 ms, faster than 99.36% of Java online submissions for Two Sum.
     * Memory Usage: 39 MB, less than 27.71% of Java online submissions for Two Sum.
     *
     * @param nums an array of ints to search
     * @param target int value to find
     * @return a primitive array with the length of 2, contains 2 numbers' indexes
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