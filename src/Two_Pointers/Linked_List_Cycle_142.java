package Two_Pointers;



public class Linked_List_Cycle_142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null){
            return null;
        }
        for(; fast.next != null && fast.next.next != null; ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(fast.next == null || fast.next.next == null){
            return null;
        }
        else{
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

    }
}
