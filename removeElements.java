/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.next == null && head.val == val) return null;
        if(head.val == val) head = head.next;
        ListNode prev = null;
        ListNode temp = null;
        ListNode ans = head;
        while(head != null){
            if(head.val == val) { //remove tihs node
                if(prev == null) { //means this is still the first element
                ans = head.next;
                } else {
                
                prev.next = head.next;
                }
                 head = head.next;
            } else {
             prev = head;
             head = head.next;
            }
        }
        return ans;
    }
}
