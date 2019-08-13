import java.util.HashSet;

class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (k < i) set.remove(nums[i - (k + 1)]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}
