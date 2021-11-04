package LinkedList;

class ListNode <T>{
	
	T t;
	ListNode<T> next;
	int size = 1;
	ListNode<T> head;
	public ListNode(T t) {
		this.t = t;
		this.next = null;
	}
	public ListNode(T t, ListNode<T> next) {
		this.t = t;
		this.next = next;
	}
	
	public void add(T t) {
		ListNode<T> node = new ListNode<T>(t);
		ListNode<T> nextnode = this;
		while(nextnode.next != null) {
			nextnode = nextnode.next;
		}
		nextnode.next = node;
		this.size++;
	}
	
	public void insert(T t, int index){
		
		ListNode<T> node = new ListNode<T>(t);
		ListNode<T> temp = this;
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
	
	public void print() {
		ListNode<T> nextnode = this;
		while(nextnode.next != null) {
			System.out.print(nextnode.t + " ");
			nextnode = nextnode.next;
		}
		System.out.print(nextnode.t + " ");
	}
	
}

public class LinkedList {
	
	public static void  main(String args[]) {
		
		ListNode node = new ListNode(0);
		for(int i = 1; i < 5; i++) {
			node.add(i);
		}
		node.print();
	}
	
}
