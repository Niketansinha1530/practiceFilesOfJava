package practiceJava;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void InsertAtEnd(int newData) {
		Node newNOde = new Node(newData);
//if head is empty
		if (head == null) {
			head = new Node(newData);
			return;
		}

		// if linkelist is not empty
		newNOde.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNOde; 
		return;
	}

	public void InsertAtBegnning(int newData) {
		Node newNOde = new Node(newData);
//if head is empty
		if (head == null) {
			head = new Node(newData);
			return;
		}
		// if linkelist is not empty

		newNOde.next = head;
		head = newNOde;

		return;
	}

//implementation 
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.InsertAtEnd(45);
		ll.InsertAtEnd(15);
		ll.InsertAtEnd(75);
		ll.InsertAtBegnning(12);
		ll.display();
	}
}
