package LinkedList;

public class AddTwoNumbers_2 {
    /**
     * 
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;
        while( l1.next != null && l2.next != null){

            l1.val += l2.val;
            if(l1.val >= 10){
                l1.val -= 10;
                l1.next.val++;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        boolean mark = false;
        l1.val += l2.val;
        if(l1.next == null && l2.next == null){
            if(l1.val >= 10){
                l1.val -= 10;
                l1.next = new ListNode(1);
            }
            return head;
        }
        if(l1.next == null){
            l1.next = l2.next;
        }
        while(l1.next != null){
            if(mark){
                l1.val++;
                mark = false;
            }
            if(l1.val >= 10){
                l1.val -= 10;
                mark = true;
            }
            l1 = l1.next;
        }
        if(mark){
            l1.val++;
            if(l1.val >= 10){
                l1.val -= 10;
                l1.next = new ListNode(1);
            }
        }
        return head;
    }

}
