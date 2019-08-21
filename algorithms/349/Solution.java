import java.util.HashSet;

class Solution {

    /**
     * Time complexity: O(max(m, n))
     * Space complexity: O(min(m, n))
     * Where m and n are length of the arrays
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // make nums1 smaller to reduce memory usage
        if (nums1.length > nums2.length) return intersection(nums2, nums1);

        HashSet<Integer> set = new HashSet<Integer>() {{  // store nums1
            for (int num : nums1) add(num);
        }};
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
