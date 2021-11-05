package LinkedList;

public class SwappingNodes_1721 {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode newhead = new ListNode(-1, head);
        ListNode returnhead = newhead;
        ListNode target1 = null;
        ListNode find1 = newhead;
        ListNode pre_t1 = null;
        ListNode pre_t2 = null;
        int n = 0;
        while (find1.next != null) {
            if (n + 1 == k) {
                target1 = find1;
            }
            find1 = find1.next;
            n++;
        }
        int knext = Math.abs(n - k + 1);
        ListNode target2 = newhead;
        int i = knext;
        while (i - 1 != 0) {

            target2 = target2.next;
            i--;
        }

        if (knext < k) {
            int t = k;
            k = knext;
            knext = t;
            ListNode temp = target1;
            target1 = target2;
            target2 = temp;
        }
        pre_t1 = target1;
        pre_t2 = target2;
        target1 = target1.next;
        target2 = target2.next;
        i = 0;
        System.out.println(target1.val + " " + target2.val);
        System.out.println(k + " " + knext);
        for (i = 0; i != knext - 1; i++) {

            if (i == k - 1) {

                

            }
            newhead = newhead.next;

        }
        //target1.next = newhead.next.next;
        //newhead.next = target1;

        return returnhead.next;
    }

}
