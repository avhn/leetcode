class Solution {

    /**
     * Time complexity: O(n).
     * Runtime: 2 ms, faster than 99.83% of Java online submissions for Container With Most Water.
     * Memory Usage: 40.7 MB, less than 13.67% of Java online submissions for Container With Most Water.
     *
     * @param height Array of heights at indexes
     * @return maximum area
     */
    public int maxArea(int[] height) {
        // li = lower index, hi = higher index
        int li = 0, hi = height.length - 1, currArea, result = 0;

        while (li < hi) {
            currArea = Math.min(height[li], height[hi]) * (hi - li);
            if (result < currArea) result = currArea;

            if (height[li] < height[hi]) li++;
            else hi--;
        }
        return result;
    }
}