package practiceJava;

import java.util.Scanner;

public class binarySearch {

	public static int Binnary(int arr[], int target)

	{
	int low=0;
	int high=arr.length-1;
	
	while(low<=high)
	{
		int mid=low+(high-low)/2;
		
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
			low=mid+1;
		}
		else {
				high=mid-1;
			}
	}
	return -1;
	}


	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,50,100,200};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Target value: ");
		int target=sc.nextInt();
		
		int result=Binnary(arr,target);
		
		if(result==-1)
		{
			System.out.println("target value not found ");
		}
		else {
			System.out.println("Target value found at= "+ result);
		}

	}

}
