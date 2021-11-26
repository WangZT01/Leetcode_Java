package DataStructure;

class Node<T>{

    Node pre;
    Node next;
    T value;

    public Node(T value, Node pre, Node next){
        this.value = value;
        this.pre = pre;
        this.next = next;
    }

}

public class DoubleLinkList <T>{

    private Node<T> head;
    private int count;

    public DoubleLinkList(){

        head = new Node<T>(null, null, null);
        head.pre = head.next = null;
        count = 0;

    }
    public int size(){
        return this.count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    private Node<T> getNode(int index){

        if(index < 0 || index >= count){
            throw new IndexOutOfBoundsException();
        }

        if(index <= count/2){
            Node<T> nnode = head.next;
            for(int i = 0; i < index; i++){
                nnode = nnode.next;
            }
            return nnode;
        }
        Node<T> pnode = head.pre;
        int rindex = count - index - 1;
        for(int j = 0; j < rindex)
    }
}
