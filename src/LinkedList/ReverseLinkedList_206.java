package LinkedList;

import LinkedList.ListNode;

public class ReverseLinkedList_206 {

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        // newList = 5; head = 4;
        ListNode newList = reverseList(head.next); //just for get the endNode.
        ListNode t =  head.next;// 5
        t.next = head; // 5 -> 4
        head.next = null;// 4 -> null
        return newList;

    }

}
