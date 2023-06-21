package practiceJava;
import java.util.*;
public class launchArray {

	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in); 
		int ar[]= {21,24,85,14,36};
		
		for(int n: ar)
		{
			System.out.println(n);
		}
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("array values "+ i + " at index "+ar[i]);
		}
		
		System.out.println("Enter values in array");
		int num[]=new int[5];
		
		for(int n: num)
		{	
			 n=scan.nextInt();
		}
		System.out.println("array elements: ");
		for(int n: num)
		{
			 System.out.println(n);
		}
	}
}
