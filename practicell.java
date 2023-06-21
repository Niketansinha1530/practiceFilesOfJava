package practiceJava;

import javax.xml.transform.Templates;

public class practicell {
	Node head;
	class Node {

		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	//InsertAtfirst
	public void insertFirst(int newData)
	{
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	//InsertAtLast
	public void insertLast(int newData)
	{
		Node newNode=new Node(newData);
		if(head==null)
		{
			head=new Node(newData);
		}
		newNode.next=null;
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	//InsertAtanyposition
	public void insertAt(Node previous,int newData)
	{
		Node newNode=new Node(newData);
		if(previous==null)
		{
			System.out.println("Not insert");
			return;
		}
		newNode.next=previous.next;
		previous.next=newNode;
		
	}
	//new way to insert
	public void newinsertAt(int position,int newData)
	{
		Node newNode=new Node(newData);
		Node temp=head;
		 if (position == 0) {
		        newNode.next = head;
		        head = newNode;
		        return;
		    }
		 
		for(int i=0;i<position-1;i++)
		{
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("Invalid position");
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return;
	}
	//Delete node from linkedlist
	public void delete(int position)
	{
		Node temp=head;
		if(head==null)
		{
			return;
		}
		if(position==0)
		{
			head=temp.next;
			return;
		}
		
		for(int i=0;i<position-1&&temp!=null;i++)
		{
			temp=temp.next;
		}
		if(temp==null&&temp.next==null)
			return;
		else {
			temp.next=temp.next.next;
		}
		return;
	}
	public void finding(int data)
	{
		if(head==null)
		{
			System.out.println("NO element in linkedLIst");
			return;
		}
		int flag=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				flag=1;
				break;
			}
		temp=	temp.next;
		}
		if(flag==1)
		{
			System.out.println(data+ " this number exist in linkedlist");
		}
		else {
			System.out.println("NOt found in linkedlist");
		}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ "-->");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		
		practicell ll=new practicell();
		ll.insertFirst(2);
		ll.insertLast(4);
		ll.insertAt(ll.head.next,8);
		ll.insertLast(12);
		ll.insertLast(14);
		ll.display();
		System.out.println();
		//ll.finding(16);//assignment question.
	ll.delete(2);
//		System.out.println();
//		ll.display();
		//ll.newinsertAt(0, 11);
		ll.display();
	}
}
