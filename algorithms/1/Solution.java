import java.util.HashMap;

class Solution {

    /**
     * Time and space complexity: O(n), where n is length of array
     */
    public int[] twoSum(int[] nums, int target) {
        // <number, index>
        HashMap<Integer, Integer> hashTable = new HashMap<>();

        for (int i = 0, diff; i < nums.length; i++) {
            diff = target - nums[i];
            if (hashTable.containsKey(diff)){
                return new int[]{hashTable.get(diff), i};
            }
            hashTable.put(nums[i], i);
        }
        return null;
    }
}
