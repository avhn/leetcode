class Solution {

    /**
     * For every point count distances using a map. We only need the information
     * on if the distances are identical, thus no need to calculate sqrt.
     *
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     */
    fun numberOfBoomerangs(points: Array<IntArray>): Int {
        var result = 0
        val cacheDistances = mutableMapOf<Int, Int>()   // Map<distance, count>
        for (point in points) {
            for (point2 in points) {
                val distance = calculateDistance(point, point2)
                cacheDistances[distance] = cacheDistances.getOrDefault(distance, 0) + 1
            }
            for (value in cacheDistances.values) {
                // (i, value different points for j, value - 1 different points for k)
                result += value * (value - 1)
            }
            cacheDistances.clear()
        }
        return result
    }
}

private fun calculateDistance(point1: IntArray, point2: IntArray): Int {
    val diffX = point1[0] - point2[0]
    val diffY = point1[1] - point2[1]
    return diffX * diffX + diffY * diffY
}
