package Recursion;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void print() {
        ListNode nextnode = this;
        while(nextnode.next != null) {
            System.out.print(nextnode.val + " ");
            nextnode = nextnode.next;
        }
        System.out.print(nextnode.val + " ");
    }
}