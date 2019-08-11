class Solution {

    /**
     * Merge two sorted arrays into prior array inplace.
     *
     * Time complexity: O(m + n).
     * Space complexity: O(1).
     * Where m and n are valid length of given arrays.
     *
     * @param a array
     * @param m valid length of a
     * @param b array
     * @param n valid length of b
     */
    public void merge(int[] a, int m, int[] b, int n) {
        while (0 < n) {
            a[m + n - 1] = (m == 0 || a[m - 1] < b[n - 1]) ? b[--n] : a[--m];
        }
    }
}
