import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {

    /**
     * Time and space complexity: O(n)
     */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null && !set.contains(head)) {
            set.add(head);
            head = head.next;
        }
        return head != null;
    }
}
