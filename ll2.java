package practiceJava;
//LinkedList Practice questions
public class ll2 {
	Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void insertAtFirst(int newData)
	{
		Node newNode =new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	public void insertAtAny(Node Previous_data, int newData)
	{ 
		Node newNode=new Node(newData);
		if(Previous_data==null)
		{
			System.out.println("Enter previous value: ");
		}
		newNode.next=Previous_data.next;
		Previous_data.next=newNode;
	}
	public void insertAtLast(int newData)
	{
		Node newNode=new Node(newData);
		
		if(head==null)
		{
			head=new Node(newData);
			return;
		}
		newNode.next=null;
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		return;
	}
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		ll2 l=new ll2();
		l.insertAtFirst(10);
		l.insertAtFirst(20);
		l.insertAtFirst(30);
		l.insertAtLast(40);
		l.insertAtAny(l.head.next, 5);
		l.display();
	}

}
