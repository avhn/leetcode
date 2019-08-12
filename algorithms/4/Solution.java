class Solution {

    /**
     * Time complexity: O(log(min(A, B))), where A and B are used as lengths of themselves
     * Space complexity: O(1)
     */
    public double findMedianSortedArrays(int[] A, int[] B) {
        // make B bigger than A
        if (A.length > B.length) {
            return findMedianSortedArrays(B, A);
        }

        int m = A.length;
        int n = B.length;
        int totalHalfLength = (m + n + 1) / 2;

        int i, j;
        int iMin = 0;
        int iMax = m;
        while (iMin <= iMax) {
            i = (iMin + iMax) / 2;
            j = totalHalfLength - i;

            if (i > iMin && A[i - 1] > B[j]) {  // too big
                iMax = i - 1;
            } else if (i < iMax && A[i] < B[j - 1]) {  // too small
                iMin = i + 1;
            } else {  // found position
                int maxLeft;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }

                if ((m + n) % 2 != 0) { // odd length, return result
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(A[i], B[j]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
