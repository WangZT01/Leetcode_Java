package LinkedList;

public class RemoveDuplicates_SortedList_83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode l = head;
        if( head == null){
            return null;
        }
        while(l.next != null){
            if(l.val == l.next.val){
                l.next = l.next.next;
            }
            else {
                l = l.next;
            }
        }
        return head;
    }

}
