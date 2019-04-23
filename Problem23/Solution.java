import java.util.Comparator;
import java.util.PriorityQueue;


class Solution {

    /**
     * Time Complexity: O(nlogn).
     * Runtime: 4 ms, faster than 92.39% of Java online submissions for Merge k Sorted Lists.
     * Memory Usage: 37.8 MB, less than 96.32% of Java online submissions for Merge k Sorted Lists.
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param lists array of linked lists
     * @return head of merged linked list
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return Integer.compare(o1.val, o2.val);
                }
        });
        for (ListNode list : lists) if (list != null) queue.add(list);

        ListNode head = null, tail = null;
        while (0 < queue.size()) {
            if (head != null) {
                tail.next = queue.poll();
                tail = tail.next;
            } else head = tail = queue.poll();

            if (tail.next != null) {
                queue.add(tail.next);
                tail.next = null;
            }
        }
        return head;
    }
}
