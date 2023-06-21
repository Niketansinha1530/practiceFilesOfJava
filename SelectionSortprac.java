package practiceJava;

import java.util.Arrays;

public class SelectionSortprac {

	public static void Select(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
				
			}
			if(min_idx!=i)
			{
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = { 20, 40, 11, 19, 27, 45 };
		Select(arr);

		System.out.println("Sorted Array Is");

		System.out.println(Arrays.toString(arr));

	}

}
