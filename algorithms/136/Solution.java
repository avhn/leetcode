import java.util.HashSet;

class Solution {

    /**
     * Find the number that appears odd number of times in the array.
     *
     * Time complexity: O(n), where n is length of the array.
     * Space complexity: O(n).
     *
     * @param nums array
     * @return number that appears odd number of times in nums
     */
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.remove(num)) set.add(num);
        }
        return set.iterator().next();
    }
}
