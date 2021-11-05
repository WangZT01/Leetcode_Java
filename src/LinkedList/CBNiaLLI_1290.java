package LinkedList;

public class CBNiaLLI_1290 {


    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while(head.next != null){

            s.append(head.val);
            head = head.next;
        }
        s.append(head.val);
        String str = s.toString();
        //(Math.pow(2,n)*head.val);
        int num = Integer.parseInt(str,2);
        return num;
    }

}
