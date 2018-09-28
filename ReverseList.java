/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode temp2 = null;
        if(head == null) {
            return null;
        } else {
        while(head.next != null) {
            temp = head.next;
            head.next = temp2;
            temp2 = head;
            head = temp;
        }
        }
        head.next = temp2;
        return head;
    }
}
