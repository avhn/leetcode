import java.util.ArrayList;

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
     * We should not modify the linked list to attain O(1) space complexity.
     *
     * Time and space complexity: O(n)
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        for (; head != null; head = head.next) list.add(head);
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (list.get(i).val != list.get(j).val) return false;
        }
        return true;
    }
}
