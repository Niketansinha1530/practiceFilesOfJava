package practiceJava;
import java.util.Stack;
import java.util.*;
public class QueueByStack {

	static Stack<Integer> stack1=new Stack<>();
	static Stack<Integer> stack2=new Stack<>();
	
	public static void enqueue(int data)
	{
		stack1.push(data);
	}
	public static int dequeue()
	{
		int ele;
		if(stack1.empty()&&stack2.empty())
		{
			System.out.println("queue is empty:");
			System.exit(0);
		}
		while(!stack1.empty())
		{
			ele=stack1.pop();
			stack2.push(ele);
		}
		return stack2.pop();
	}
	public static void show()
	{
		System.out.println(stack2);
	}
	public  void main(String[] args) {
		
		QueueByStack s=new QueueByStack();
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		s.enqueue(40);
		
		System.out.println(s.dequeue());
		//s.show();
	}
}
