/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        if (head.next == null) {
         return head;   
        } else {    
            while(head.next != null) {
                count++;
                head = head.next;
                if(count %2 == 0) temp = temp.next;    
            }
            if(count %2 == 1) temp = temp.next;
            return temp;
        }
    }
}
