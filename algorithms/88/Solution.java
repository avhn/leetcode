class Solution {

    /**
     * Time complexity: O(m + n), where m and n are valid length of given arrays
     * Space complexity: O(1)
     */
    public void merge(int[] a, int m, int[] b, int n) {
        while (0 < n) {
            a[m + n - 1] = (m == 0 || a[m - 1] < b[n - 1]) ? b[--n] : a[--m];
        }
    }
}
