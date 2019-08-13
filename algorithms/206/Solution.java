/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {

    public ListNode reverseList(ListNode head) {
        return iterativeReverseList(head);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    private ListNode iterativeReverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * Invoke as recursiveReverseList(null, head).
     *
     * Time and space complexity: O(n)
     */
    private ListNode recursiveReverseList(ListNode previous, ListNode current) {
        if (current == null) return previous;
        ListNode head = recursiveReverseList(current, current.next);
        current.next = previous;
        return head;
    }
}
