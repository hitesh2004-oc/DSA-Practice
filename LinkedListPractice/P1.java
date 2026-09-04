package LinkedListPractice;

public class P1 {
	// Head Node
	Node head;
	private int size;
	P1(){
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;		
			this.next = null;
			size++;
		}
	}

	// Add Node in LL
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			 head = newNode;
			 return;
		}
		newNode.next = head;
		head = newNode;
	}
	// Add Node at Last of LinkedList
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			 head = newNode;
			 return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	// For Print LinkedList
	public void Printll() {
		if(head == null) {
			 System.out.println("Linked List is Empty");
			 return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.print("Null");
	}
	
	// For DeleteNode in LinkedList
	public void deleteFirst() {
		if(head == null) {
			System.out.println("LL is Empty");
			return;
		}
		size--;
		head = head.next;
	}
	public void deleteLast() {
		if(head == null) {
			System.out.println("LL is Empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node sn = head;
		Node ln = head.next;
		while(ln.next != null) {
			ln = ln.next;
			sn = sn.next;
		}
		sn.next = null;
	}
	
	// For FindLength
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		P1 ll = new P1();
		ll.addFirst("5");
		ll.addFirst("4");
		ll.addFirst("3");
		ll.Printll();
		
		ll.addLast("6");
		System.out.println();
		ll.Printll();
		
		ll.deleteFirst();
		System.out.println();
		ll.Printll();
		
		ll.deleteLast();
		System.out.println();
		ll.Printll();
		System.out.println();
		
		System.out.println(ll.getSize());
	}

}
