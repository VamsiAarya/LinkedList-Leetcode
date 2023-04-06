public class RemoveElementsFromLL {

        public ListNode removeElements(ListNode head, int val) {

            //checking if the given head is null
            if(head == null){
                return null;
            }

            // if the entire list is having same elements -> 5,5,5,5
            while(head !=null && head.val == val){
                head = head.next;
            }

            ListNode current = head;
            ListNode prev = new ListNode();

            // removing elements if matches the given value by iterating till end
            while(current != null ){

                if(current.val == val ){
                    prev.next = current.next;
                }
                else {
                    prev = current;
                }

                current = current.next;
            }

            return head;
        }
}

//Time complexity  - O (n) since iterating through all the elements
// Space complexity - O(1) using only one extra node irrespective of the size  of the list.