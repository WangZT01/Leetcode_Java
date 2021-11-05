package LinkedList;


/**
 * slow-fast pointer
 */
public class MiddleoftheLinkedList_876 {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    /**
     * while (fast != null && fast.next != null) { //current state & next state
     *             slow = slow.next;
     *             fast = fast.next.next;
     *         }
     *         return slow;
     */
}
