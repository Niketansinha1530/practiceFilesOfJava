package practiceJava;

import java.util.Scanner;

public class TwoSumArray {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target element: ");
		int target=sc.nextInt();
		int ind[]= new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					 ind[0]=i;
					 ind[1]=j;
				}
			}
		}
		
			System.out.println(ind[0]+","+ind[1]);
	
	}
}
