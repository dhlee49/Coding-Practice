/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MeregeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = null;
        if(l1 == null) {
            return l2;
        }  else if(l2 == null) return l1;
        if(l1.val < l2.val){
        ans = l1;
        l1 = l1.next;
        } else{
        ans = l2;
        l2 = l2.next;
        }
        ListNode head = ans;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                ans.next = l1;
                ans = l1; 
                l1 = l1.next;
            } else {
                ans.next = l2;
                ans = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null) {
            ans.next = l2;
            
        } else { 
            ans.next = l1;
        }
        return head;
    }
}
