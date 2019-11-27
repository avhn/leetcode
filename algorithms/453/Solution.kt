class Solution {

    /**
     * We can decrease 1 element instead of incrementing n - 1 elements
     * at every step with the objective of making whole array even.
     * Decreasing min at array would make n - 1 extra moves and isn't optimal.
     * Thus our target is min for optimal solution.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    fun minMoves(nums: IntArray): Int {
        var sum = 0
        var min = nums[0]
        for (num in nums) {
            sum += num
            if (num < min) min = num
        }
        return sum - min * nums.size
    }
}
