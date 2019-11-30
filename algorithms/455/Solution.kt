import java.util.*

class Solution {

    /**
     * Time complexity: O(n log(n)), where n is max(len(g), len(s))
     * Space complexity: O(1)
     */
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        Arrays.sort(g)
        Arrays.sort(s)
        var i = 0 // content childes
        var j = 0
        while (i < g.size && j < s.size) {
            if (g[i] <= s[j++]) i++
        }
        return i
    }
}
