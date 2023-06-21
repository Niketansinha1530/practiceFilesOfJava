package practiceJava;

import java.util.Scanner;

public class linearSearchprac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,2,45,3,1,8,6,75,100};
		
		System.out.print("Enter the target value : ");
		int target=sc.nextInt();
		
		int result=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				result=i;
				
				break;
			}
		}
		if(result==-1)
		{
			System.out.println("Target value is not found ");
		}
		else {
				System.out.println("Target value is found at = "+result);
		}

	}

}
