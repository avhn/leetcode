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
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                if (current == head) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
            } else previous = current;    // current not removed
            current = current.next;
        }
        return head;
    }
}
