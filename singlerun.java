package practiceJava;
import java.util.*;
class demo12 extends Thread
{
	Scanner scan = new Scanner(System.in);
	public void run()
	{
	String name=Thread.currentThread().getName();
	if(name.equals("raj"))
	{
		raj();
	}
	else {
			rani();	
	 }
	
	}
	public void raj() 
	{
		System.out.println("Enter first no: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no; ");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("result"+result);
		
	}
	
	public void rani()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("hi rani");	
		}
			
	}
	
		
	
	
}
public class singlerun {

	public static void main(String[] args) {
		demo12 d=new demo12();
		demo12 d2=new demo12();
		
		d.setName("raj");
		d2.setName("rani");
		
		d.start();
		d2.start();

	}

}
