import java.util.HashSet;

class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.remove(num)) set.add(num);
        }
        return set.iterator().next();
    }
}
