class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int missingNumber(int[] nums) {
        int diff = nums.length;  // last index of the array with missing number
        for (int i = 0; i < nums.length; i++) {
            diff += i - nums[i];  // diff ^= i ^ nums[i]
        }
        return diff;
    }
}
