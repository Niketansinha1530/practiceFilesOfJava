package practiceJava;

import java.util.Arrays;

public class sortingAlgo {
	static int count=0;
public static void sortingBubble(int arr[])
{
	int n=arr.length;
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]<arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count++;
			}
		}
	}
}
	public static void main(String[] args) {
		
		int arr[]= {152,8,6,455,2,100,4};
		
		sortingBubble(arr);
		System.out.println(Arrays.toString(arr));
System.out.println("Numbers of swaps= "+count);
	}

}
