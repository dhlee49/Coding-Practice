/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = head;
        if(head == null) return null;
        int dup = head.val;
        ListNode prev = head;
        head = head.next;
        while(head != null) {
            if(head.val == dup) {   
             prev.next = head.next;
             head = head.next;
            } else {
                prev = head;
                dup = head.val;
                head = head.next;
            }
            
        }
        return ans;
    }
}
