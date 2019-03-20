class Solution {

    /**
     * Time complexity: O(n).
     * Runtime: 5 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
     * Memory Usage: 37.9 MB, less than 52.56% of Java online submissions for Remove Nth Node From End of List.
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param head head of the linked list
     * @param n reverse rank of the node to remove
     * @return head of the linked list after removing nth node
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // l* = lower*, h* = higher*
        ListNode lNode = head, hNode = head;
        int li, hi, diff;

        for (li = 0, hi = 0, diff = 0; hNode != null ; hi++, diff = hi - li) {
            if (diff == n + 1) {
                // lower index stays one node back to remove the node
                // thus n + 1 difference is there

                li++;
                lNode = lNode.next;
            }

            hNode = hNode.next;
        }

        // n not in range, catch exception
        if (diff < n) return null;

        // n is head, remove head
        if (diff == n) head = head.next;
        // remove node
        else lNode.next = lNode.next.next;

        return head;
    }
}