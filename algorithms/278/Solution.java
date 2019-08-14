/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (l == m) break;
            if (isBadVersion(m)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }
}
