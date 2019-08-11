class Solution {

    /**
     * Helper method for reverseKGroup.
     * Reverse a linked sequence considering where end points too.
     *
     * For example:
     *  [ start -> a -> b -> c -> end -> d ]
     *  [ end -> c -> b -> a -> start -> d ]
     *
     * @param start ListNode
     * @param end ListNode
     * @return parameter end
     * @see ListNode
     */
    private ListNode reverse(ListNode start, ListNode end) {
        ListNode head = end.next;
        ListNode current = start;
        ListNode next;

        while (current != end) {
            next = current.next;
            current.next = head;
            head = current;
            current = next;
        }

        end.next = head;
        return end;
    }

    /**
     * Time complexity: O(n).
     * Space complexity: O(1).
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param head linked list
     * @param k number of nodes to reverse
     * @return new head of the linked list
     * @see ListNode
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 1 || head == null) return null;
        else if (k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        ListNode start;
        ListNode end = dummy;   // initialize randomly to start the loop

        while (end != null) {
            start = previous.next;
            end = start;

            for (int i = 1; i < k && end != null; i++) {
                end = end.next;
            }

            if (end != null) {
                previous.next = reverse(start, end);
                previous = start;   // start is the new end
            }
        }
        return dummy.next;
    }
}
