package Recursion;



public class SwapNodesinPairs_24 {

    public ListNode swapPairs(ListNode head) {
        ListNode l = head;
        swap(head);
        return l;
        /**
         if (head == null || head.next == null)
            return head;
         ListNode t = head;
         head = head.next;
         t.next = swapPairs(head.next);
         head.next = t;
         return head;
         **/
    }
    public void swap(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        int t = head.val;
        head.val = head.next.val;
        head.next.val = t;
        head = head.next;
        swap(head.next);
    }

}
