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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode i = head;
        ListNode j = head.next;
        
        while (i != null && j != null && j.next != null) {
            if (i == j) {
                return true;
            }
            i = i.next;
            j = j.next.next;
        }
        
        return false;
    }
}
