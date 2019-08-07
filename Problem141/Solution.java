import java.util.HashSet;


public class Solution {

    /**
     * Find if given linked list has a cycle.
     *
     * Time complexity: O(n), where n is size of the linked list.
     * Space complexity: O(n).
     *
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     *
     * @param head linked list
     * @return boolean indicating if linked list has a cycle
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
