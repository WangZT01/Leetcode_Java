package LinkedList;



import java.util.Stack;


class Solution {
    public static ListNode reverseList(ListNode head) {

        Stack<Integer> s = new Stack<Integer>();

        if(head == null){
            return null;
        }
        while(head.next != null){

            s.push(head.val);
            head = head.next;

        }
        s.push(head.val);
        ListNode l = new ListNode(s.peek());
        ListNode l2 = l;
        s.pop();
        while(!s.empty()){

            l.next = new ListNode(s.peek());
            s.pop();
            l = l.next;
        }
        return l2;
    }

    //while-loop
    public void commonReverse(ListNode head){
        ListNode curr = head;
        ListNode reve = null;
        while(curr != null){
            ListNode temp = curr;
            curr = curr.next;
            temp.next = reve;
            reve = temp;
        }

    }

    public static void  main(String args[]) {

        ListNode n = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode m = reverseList(n);
        m.print();
    }

}