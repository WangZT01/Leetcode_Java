package DataStructure;


public class LinkedList <T>{

	T t;
	LinkedList<T> next;
	int size = 1;
	LinkedList<T> head;
	public LinkedList(T t) {
		this.t = t;
		this.next = null;
	}
	public LinkedList(T t, LinkedList<T> next) {
		this.t = t;
		this.next = next;
	}

	public void add(T t) {
		LinkedList<T> node = new LinkedList<T>(t);
		LinkedList<T> nextnode = this;
		while(nextnode.next != null) {
			nextnode = nextnode.next;
		}
		nextnode.next = node;
		this.size++;
	}

	public void insert(T t, int index){

		LinkedList<T> node = new LinkedList<T>(t);
		LinkedList<T> temp = this;
		if(index > size){
			add(t);
		}
		if(index == 1) {
			node.next = temp;
		}
		else {
			for(int i = 0; i < index-1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			this.size++;
		}

	}
	public LinkedList findNodeByIndex(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("链表越界");
		}
		LinkedList current = head;
		int t = 0;
		while (current != null) {
			if (t == index) {
				break;
			}
			current = current.next;
			t++;
		}
		return current;
	}

	public T deleteNode(int index) {
		LinkedList dNode = null;
		if (index < 0 || index > size - 1) {
			throw new IndexOutOfBoundsException("链表越界");
		}
		if (index == 0) {
			dNode = head;
			head = head.next;
		} else {
			LinkedList pre = findNodeByIndex(index - 1);//获取要删除的节点的前一个节点
			dNode = pre.next;//要删除的节点就是pre的next指向的节点
			pre.next = dNode.next;//删除以后pre的next指向被删除节点之前所指向的next
			dNode.next = null;
		}
		return (T) dNode.t;
	}

	public void print() {
		LinkedList<T> nextnode = this;
		while(nextnode.next != null) {
			System.out.print(nextnode.t + " ");
			nextnode = nextnode.next;
		}
		System.out.print(nextnode.t + " ");
	}
	
}
