class Solution {

    /**
     * Search target in an array with binary search.
     *
     * Time complexity: O(log n), where n is length of the array.
     * Space complexity: O(1).
     *
     * @param nums number array
     * @param target decimal
     * @return an index in range of [0, ..., array's length]
     */
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 2) {
            return nums.length < 1 ? 0 : (target <= nums[0] ? 0 : 1);
        }

        int left = 0;
        int right = nums.length - 1;
        int index = right / 2;

        while (target != nums[index]) {
            if (left == index) {    // not found, return appropriate index
                if (target <= nums[index]) return index;
                else if (target <= nums[right]) return index + 1;
                else return index + 2;
            }
            else if (target <= nums[index]) right = index;
            else left = index;

            index = (left + right) / 2;
        }
        return index;
    }
}
