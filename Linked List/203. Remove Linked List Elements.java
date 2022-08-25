class Solution {

    public ListNode removeElements(ListNode head, int val) {
        // base condition
        
        if( head == null ){
            return null;
        }
        
        ListNode tempNode = head;
        
        while( tempNode.next != null ){
            if( tempNode.next.val == val ){
                tempNode.next = tempNode.next.next;
            }else{
                tempNode = tempNode.next;
            }
        }
        
        // checking  for head
        if( head.val == val ){
            head = head.next;
        }
        
        return head;
    }
}
