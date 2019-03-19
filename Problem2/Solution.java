class Solution {

    /**
     * Time complexity: O(logn) where n is the number of digits at biggest node.
     * Runtime: 19 ms, faster than 99.14% of Java online submissions for Add Two Numbers.
     * Memory Usage: 48.1 MB, less than 27.01% of Java online submissions for Add Two Numbers.
     *
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     *
     * @param l1 ListNode
     * @param l2 ListNode
     * @return A ListNode represents sum of l1 and l2
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