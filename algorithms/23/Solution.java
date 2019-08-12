import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {

    /**
     * Priority queue takes log(n) times for every poll.
     * We do this n times, where n is total number of nodes in lists.
     *
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
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
