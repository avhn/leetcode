import java.util.HashMap;
import java.util.Map;

class Solution {

    /**
     * Time complexity: O(n).
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