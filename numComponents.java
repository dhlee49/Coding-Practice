/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class numComponents {
    public int numComponents(ListNode head, int[] G) {
        int ans = 0;
        int max = 0;
        boolean faced = false;
        for(int i =0; i< G.length;i++){
            if(max < G[i]) max = G[i];
        }
        int[] chk = new int[max+1];
        for(int i=0;i<G.length;i++) {
            chk[G[i]] = 1;
        }
        
        while(head != null) {
            if(head.val <= max) {
                if(chk[head.val] == 1) {
                    faced = true;
                } else {
                    if(faced) ans++;
                    faced = false;
                }
            } else{
                if(faced) ans++;
                faced = false;
            }
           head = head.next;
        }
        if(faced) ans++;
        return ans;
    }
   
}
