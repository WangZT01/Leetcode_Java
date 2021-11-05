package LinkedList;

public class MergeLists_1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode first = list1;
        ListNode end = list1;
        while(a != 1){
            first = first.next;
            a--;
        }
        while(b != 1){
            end = end.next;
            b--;
        }
        end = end.next;
        first.next = list2;
        while(first.next != null){
            first = first.next;
        }

        first.next = end.next;
        return list1;

    }

}
