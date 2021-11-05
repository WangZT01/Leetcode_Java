package LinkedList;

public class DeleteNode_237 {


    /**
     * Cover instead of delete!!!!!!!!!!!!!!
     * @param node
     */
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }

}
