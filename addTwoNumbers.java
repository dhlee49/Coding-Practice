/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        int len1 = len(l1);
        int len2 = len(l2);
        int tlen = 0;
        if(len1 < len2) { //makes l1 always the longer one 
            head = l1;
            l1 = l2;
            l2 = head;
            tlen = len1;
            len1 = len2;
            len2 = tlen;
        }
        head = l1;
        if(len1 == 0 || len2 == 0) return head;
        ListNode prev = null;
          for(int i=0;i<len1- len2;i++) {
             prev = l1;
                    l1 = l1.next;
         }
        
        boolean oh = false;
        while(l1 != null) {
            l1.val = l1.val + l2.val;
            if(l1.val >= 10) {
             l1.val = l1.val - 10;
             oh = true;
             if(l1 == head){
              head = new ListNode(1);
              head.next = l1;
             } else {
             prev.val = prev.val + 1;
             }
            }
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
            }
        prev = null;
        while(oh){
            oh = false;
            ListNode curr = head;
            while(curr != null){ 
                if(curr.val >= 10) {
                    if(curr == head) {
                      curr.val = curr.val - 10;
                      head = new ListNode(1);
                      head.next = curr;
                    } else {
                      curr.val = curr.val - 10;
                      prev.val = prev.val + 1;
                      if(prev.val >= 10) oh = true;
                    }
                }
            prev = curr;
            curr = curr.next;
            }
        }
        return head;
        }
        
    
    public int len(ListNode head) {
        int cnt = 0;
        while(head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }
}
