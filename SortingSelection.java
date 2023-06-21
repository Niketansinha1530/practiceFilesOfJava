package practiceJava;

import java.util.Arrays;

public class SortingSelection {
static int count=0;
	public static void sortingselect(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[min_idx])
				{
					min_idx=j;
				}
			}
			if(i!=min_idx)
			{
				int temp=arr[i];
				arr[i]=arr[min_idx];
				arr[min_idx]=temp;
				count++;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {3,5,1,6,0};
		
		sortingselect(arr);
		System.out.println(Arrays.toString(arr));
System.out.println("NO of swaps= "+count);
		
	}
	
}
