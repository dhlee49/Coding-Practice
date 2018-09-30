class MyLinkedList {
       private ListNode head ;
       private ListNode tail ;
       private int size ;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {      
        if(index >= size || size == 0) return -1;
        ListNode curr = head;
        for(int i =0;i<index;i++){
            curr = curr.getNext();
        }
        return curr.getVal();
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        ListNode new_node = new ListNode(val);
        new_node.setNext(head);
        head = new_node;
        if(size == 0) tail = new_node;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        
         ListNode new_node = new ListNode(val);
        if(tail != null) {
         tail.setNext(new_node);
        } 
        tail = new_node;
        if(size == 0) head = new_node;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
        if(index > size) return;
        if(index == 0 || index == 0) {
            addAtHead(val); 
            return;
        }
        if(index == size) {
         addAtTail(val);
            return;   
        }
        ListNode curr = head;
        ListNode prev = null;
        for(int i=0;i< index;i++){
            prev = curr;
            curr = curr.getNext();
        }
        ListNode n_node = new ListNode(val);
        prev.setNext(n_node);
        n_node.setNext(curr);
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
         if(index >= size) return;
        if(index == 0 ) {
            head = head.getNext();
            if(size == 1) tail = null;
        } else{ 
        ListNode curr = head;
        ListNode prev = null;
        for(int i=0;i< index;i++){
            prev = curr;
            curr = curr.getNext();
        }
        prev.setNext(curr.getNext());
        if(size-1  == index) tail = prev;
        }
            size--;
     }
   
}

 class ListNode {
        private int val;
        private ListNode next;
        
        public ListNode(){ 
        val = 0;
        next = null;
        }
        public ListNode(int k) {
        next = null;
        val = k;
        }
        public void ListNode(int k, ListNode n_next) {
        next = n_next;
        val = k;
        }
        public ListNode getNext() {
            return next;
        }
        public int getVal() {
            return val;
        }
        public void setNext(ListNode n_next) {
            next = n_next;
        }
        public void setVal(int k) {
            val = k;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
