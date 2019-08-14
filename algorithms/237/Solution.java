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
    public void deleteNode(ListNode node) {
        assert node != null && node.next != null;

        ListNode previous = null;
        while (node.next != null) {
            node.val = node.next.val;
            previous = node;
            node = node.next;
        }
        previous.next = node.next;
    }
}
