class Solution {

    /**
     * Remove dublicates from a linked list.
     *
     * Time complexity: O(n), where n is length of linked list.
     * Space complexity: O(1).
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     *
     * @param head linked list
     * @return head
     * @see ListNode
     */
    public ListNode deleteDuplicates(ListNode head) {
        for (ListNode current = head; current != null; current = current.next) {
            while (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            }
        }
        return head;
    }
}
