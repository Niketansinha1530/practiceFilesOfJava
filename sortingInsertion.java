package practiceJava;

import java.util.Arrays;

public class sortingInsertion {

	public static void sortingInsertion(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int j=i;
			while(j>0 && arr[j]>arr[j-1])
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {20,40,11,19,27,45};
		
		sortingInsertion(arr);
		System.out.println(Arrays.toString(arr));

	}

}
