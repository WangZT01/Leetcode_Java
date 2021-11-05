package LinkedList;


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

	public void print() {
		LinkedList<T> nextnode = this;
		while(nextnode.next != null) {
			System.out.print(nextnode.t + " ");
			nextnode = nextnode.next;
		}
		System.out.print(nextnode.t + " ");
	}
	
}
