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
     * Time complexity: O(log n), where n is the number of digits at longest list
     * Space complexity: O(1)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null, current = null;
        int sum, val, carry = 0;
        while (l1 != null || l2 != null) {
            sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            val = sum % 10;

            if (root == null) {
                root = new ListNode(val);
                current = root;
            } else {
                current.next = new ListNode(val);
                current = current.next;
            }
        }
        if (carry > 0) current.next = new ListNode(carry);
        return root;
    }
}
