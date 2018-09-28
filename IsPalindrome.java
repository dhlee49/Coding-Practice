/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null) return true;
        if(head.next == null) return true;
        int count = 1;
        ListNode saved = head;
        ListNode center = head;
        while(head.next != null) {
            head = head.next;
            count ++;
            if(count % 2 == 1) center = center.next;    
        }
            head = center.next;
        
        ListNode temp = null;
        ListNode prev = null;
        while(head.next != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        head.next = prev;
      while(head != null) {
            if(saved.val != head.val) return false;
            head = head.next;
            saved = saved.next;
        }
        return true;
    }
}
