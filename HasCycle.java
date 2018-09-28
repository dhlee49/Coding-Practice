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
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode fastie = head.next;
        while(head.next != null && fastie.next != null && fastie.next.next != null) {
            head = head.next;
            fastie = fastie.next.next;
            if(head == fastie) return true;
        }
        return false;
    }
}
