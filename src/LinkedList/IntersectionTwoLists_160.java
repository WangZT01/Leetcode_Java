package LinkedList;

import java.util.Stack;

public class IntersectionTwoLists_160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        int na = 0;
        int nb = 0;
        ListNode Intersection = null;

        while(a.next != null){
            na++;
            a = a.next;
        }

        while(b.next != null){
            nb++;
            b = b.next;
        }
        int ab = Math.abs(na-nb);
        if(na > nb){
            while(ab != 0){
                headA = headA.next;
                ab--;
            }
        }
        else{
            while(ab != 0){
                headB = headB.next;
                ab--;
            }
        }
        while( headA != headB ){

            headA = headA.next;
            headB = headB.next;

        }
        return  headA;
    }

    /**
     * slow - fast pointer
     * public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     *         // create two pointers
     *         ListNode p1, p2;
     *         p1 = headA;
     *         p2 = headB;
     *         while (p1 != p2) {
     *             if (p1 == null) {
     *                 p1 = headB;
     *             } else {
     *                 p1 = p1.next;
     *             }
     *             if (p2 == null) {
     *                 p2 = headA;
     *             } else {
     *                 p2 = p2.next;
     *             }
     *         }
     *         if (p1 == null) {
     *             return null;
     *         }
     *         return p1;
     *     }ew
     * @param args
     */

    public static void  main(String args[]) {

        ListNode n1 = new ListNode(1, new ListNode(1, new ListNode(6, new ListNode(9))));
        ListNode n2 = new ListNode(2, new ListNode(1, new ListNode(6)));
        ListNode n3 = getIntersectionNode(n1,n2);
        n3.print();
    }



}
