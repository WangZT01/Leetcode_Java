package LinkedList;

public class RemoveElements_203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode l = head;
        if(head == null)
            return null;
        while(l.next != null){

            if(l.next.val == val){
                l.next = l.next.next;
            }
            else{
                l = l.next;
            }
        }
        if(l.val == val){
            l = null;
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }

}
