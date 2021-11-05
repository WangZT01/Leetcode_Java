package LinkedList;



public class MergeTwoSortedLists_21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        else if( l2 == null){
            return l1;
        }

        ListNode head = null;

        if(l1.val > l2.val){
            head = l2;
            l2 = l2.next;
        }
        else{
            head = l1;
            l1 = l1.next;
        }
        ListNode r = head;
        while( l1 != null && l2 != null){

            if(l1.val > l2.val){
                head.next = l2;
                l2 = l2.next;
            }
            else{
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        if(l1 == null){
            head.next = l2;
        }
        else if( l2 == null){
            head.next = l1;
        }
        return r;
    }

    /**
     * class Solution {
     * public ListNode mergeTwoLists(ListNode l1, ListNode l2)
     * {
     *
     *     if(l1==null){
     *         return l2;
     *     }else if(l2==null){
     *         return l1;
     *     }
     *
     *     if(l1.val>l2.val){
     *         l2.next=mergeTwoLists(l1,l2.next);
     *         return l2;
     *     }else{
     *         l1.next=mergeTwoLists(l1.next,l2);
     *         return l1;
     *     }
     *
     * }
     * }
     * @param args
     */

    public static void  main(String args[]) {

        ListNode n = new ListNode(1, new ListNode(1, new ListNode(6, new ListNode(9))));
        ListNode n2 = new ListNode(9);
        ListNode m = mergeTwoLists(n,n2);
        m.print();
    }


}
