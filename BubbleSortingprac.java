package practiceJava;

import java.util.Arrays;

public class BubbleSortingprac {

	public static void Bubble(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {20,10,10,40,100,90};
		Bubble(arr);
		System.out.println("Sorted Array Is");
		
		System.out.println(Arrays.toString(arr));
	}
}
