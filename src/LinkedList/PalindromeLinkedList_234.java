package LinkedList;

public class PalindromeLinkedList_234 {

    public static boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }
        int t1 = head.val;
        int t2 = head.val;
        if(head.next != null){
            ListNode last = ipr(head);
            t2 = last.val;
            //ipr(head);
        }
        //System.out.println(t1 + " " + t2);
        boolean result = (t1 == t2);
        //System.out.println(result);
        return result && isPalindrome(head.next);

    }

    public static ListNode ipr(ListNode head, ListNode last){

        if(head.next != null){
            last = ipr(head,head.next);

        }
        boolean result = (head.val == last.val);
        System.out.println(result);
        return last;
    }

    public static void  main(String args[]) {

        ListNode n = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean m = isPalindrome(n);
        System.out.println(m);
    }

}
