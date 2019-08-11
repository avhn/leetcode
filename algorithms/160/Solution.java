public class Solution {

    /**
     * Find intersection of two linked-lists.
     *
     * Time complexity: O(m + n), where m and n are size of linked lists.
     * Space complexity: O(1).
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     *
     * @param headA linked list
     * @param headB linked list
     * @return intersection or null
     * @see ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
