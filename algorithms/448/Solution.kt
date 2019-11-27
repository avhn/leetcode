class Solution {

    /**
     * Record appearances of number in the array by adding n
     * to corresponding index, then acquire disappeared numbers
     * and normalize array before returning.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val disappearedNumbers = mutableListOf<Int>()
        val n = nums.size
        for (i in 0 until n) {
            nums[(nums[i] - 1) % n] += n
        }
        for (i in 0 until n) {
            if (nums[i] <= n) {
                disappearedNumbers.add(i + 1)
            } else {
                nums[i] %= n
                if (nums[i] == 0) nums[i] = n
            }
        }
        return disappearedNumbers
    }
}
