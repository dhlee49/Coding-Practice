/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Assume n refers to the size of both list 
public class getIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        //They appear to be intersecting only once therfroe if size of list A and B differ, size diff = 1 list is longer
        int A_size = getSize(headA);
        int B_size = getSize(headB);
        /* 3 possible cases
        *   1. A_size = B_size indicating they intersect at same iteration
        *   2. A_size > B_size indicating A will go through Asize- Bsize more nodes before intersecting
        *   3. B_size > A_size same as 2 except A replaced with B
        * simple solution move head so we sync their iteration
        */
            for(int i =0; i< A_size - B_size;i++) headA = headA.next;
            for(int i =0; i< B_size - A_size;i++) headB = headB.next;
            
        while(headA != headB) {
            headA= headA.next;
            headB= headB.next;
        }
        return headA;
        
    }
     //given head of a list return size of entire list;
    // runs in O(n) where n = size of list

    public int getSize(ListNode head)
    {
        if(head == null) return 0;
     int size =0; 
     while(head != null) {         
         size ++;
         head = head.next;
     } 
        return size;
    }
}
