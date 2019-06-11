class Solution {

    /**
     * Time complexity: O(n).
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