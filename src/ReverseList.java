public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if(head ==null){
            return null ;
        }

        ListNode prev = null;
        ListNode current = head;

        while(current!= null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
        return head;
    }

}

//tc = O(n) , sc =O(1)