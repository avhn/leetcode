class Solution {

    /**
     * Time Complexity: O(n).
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
     * Memory Usage: 37 MB, less than 97.90% of Java online submissions for Merge Two Sorted Lists.
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param l1 ListNode as head of linked list to merge
     * @param l2 ListNode as head of linked list to merge
     * @return head of the merged linked list
     * @see ListNode
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