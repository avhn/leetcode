import java.util.HashSet;

class Solution {

    /**
     * Time and space complexity: O(max(m, n)), where m and n are length of the arrays
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) return intersection(nums2, nums1);

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) set.add(num);
        HashSet<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) result[i++] = num;
        return result;
    }
}
