class Solution {

    /**
     * Time Complexity: O(n).
     * Runtime: 2 ms, faster than 99.97% of Java online submissions for Swap Nodes in Pairs.
     * Memory Usage: 36.8 MB, less than 72.50% of Java online submissions for Swap Nodes in Pairs.
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param head ListNode, head of linked list
     * @return head of the list after swaps
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        /*
         * Swap {p1, p2} to {p2, p1}
         * Point previous pointer to p1
         *
         * prev = p1 at previous swap
         * p1 = first node to swap
         * p2 = second node to swap
         */
        ListNode prev = null, p1 = head, p2 = head.next;

        do {
            // modify pointers
            p1.next = p2.next;
            p2.next = p1;
            if (prev != null) prev.next = p2;
            else head = p2;

            // move pointers further
            prev = p1;
            p1 = p1.next;
            if (p1 != null) p2 = p1.next;
        } while (p1 != null && p2 != null);

        return head;
    }
}