package practiceJava;

import java.util.Arrays;
import java.util.Scanner;

public class printbinary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number = ");
		int num=scn.nextInt();
		int index=0;
		System.out.println("Enter the no how much bit is requied");
		int n=scn.nextInt();
		int arr[]= new int[n];
		while(num>0)
		{
			arr[index]=num%2;
			index++;
			num=num/2;
		}
	  System.out.print("Given number in bits= ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
		System.out.println();
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==1)
//			{
//				count++;
//			}
//		}
//		if(count==1)
//		{
//			System.out.println("Given no is perfect power of 2");
//		}
//		else {
//			System.out.println("Not perfect power of two");
//		}
		
	}

}
