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
     * Time complexity: O(n), where n is length of the shorter list
     * Space complexity: O(1)
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null, previous = null, current;
        while (l1 != null || l2 != null) {
            // select current node to insert,
            // move list pointers further
            // then isolate the node
            if (l1 == null) {
                current = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                current = l1;
                l1 = l1.next;
            } else {
                // select smaller one
                if (l1.val < l2.val ) {
                    current = l1;
                    l1 = l1.next;
                } else {
                    current = l2;
                    l2 = l2.next;
                }
            }
            current.next = null;
            // insert the node
            if (head == null) head = current;
            if (previous != null) previous.next = current;
            previous = current;
        }
        return head;
    }
}
