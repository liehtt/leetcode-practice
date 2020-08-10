/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode s = head;
        ListNode f = head.next;
        
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        
        s = reverse(s);
        
        while (head != null && s != null) {
            if (head.val != s.val) return false;
            head = head.next;
            s = s.next;
        }
        
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        return head; 
    }
}
