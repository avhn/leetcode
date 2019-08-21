import java.util.HashMap;

class Solution {

    /**
     * Time complexity: O(max(m, n))
     * Space complexity: O(min(m, n))
     * Where m and n are length of the arrays
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // make nums1 smaller to reduce memory usage
        if (nums1.length > nums2.length) return intersect(nums2, nums1);

        // map <num, number of appearances>
        HashMap<Integer, Integer> map = new HashMap<>();  // store nums1
        HashMap<Integer, Integer> intersection = new HashMap<>();
        for (int num : nums1) {  // count nums1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int resultSize = 0;
        for (int num : nums2) {  // intersect
            if (0 < map.getOrDefault(num, 0)) {
                resultSize++;
                intersection.put(num, intersection.getOrDefault(num, 0) + 1);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[resultSize];
        for (int key : intersection.keySet()) { // build result array
            for (int i = 0; i < intersection.get(key); i++) {
                result[--resultSize] = key;
            }
        }
        return result;
    }
}
