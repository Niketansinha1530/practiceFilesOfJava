package practiceJava;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[])
	{
		int n=arr.length;
	boolean swap=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=false;
				}
			}
			if(!swap)
			{System.out.println("helo");
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {25,14,3,58,100,12,104};
		bubbleSort(arr);
		
		System.out.println("Sorting array");
		
		System.out.println(Arrays.toString(arr));
	}
}
