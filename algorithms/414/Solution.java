import java.util.Iterator;
import java.util.LinkedList;

class Solution {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public int thirdMax(int[] nums) {
        // ascending order, keep maximum of 3 elements
        LinkedList<Integer> maxList = new LinkedList<>();
        for (int n : nums) {
            insert(n, maxList);
            if (3 < maxList.size()) maxList.removeFirst();
        }
        return maxList.size() < 3 ? maxList.getLast() : maxList.getFirst();
    }

    /**
     * Insert in ascending order.
     */
    private void insert(int n, LinkedList<Integer> list) {
        int insertionIndex = 0;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); insertionIndex++) {
            int current = (int) iterator.next();
            if (n < current) break;
            else if (n == current) return;  // duplicate
        }
        list.add(insertionIndex, n);
    }
}
