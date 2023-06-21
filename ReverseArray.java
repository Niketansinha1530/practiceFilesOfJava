package practiceJava;

import java.util.Arrays;

public class ReverseArray {
public static void Reverse(int arr[])
{
	int n=arr.length;
	for(int i= 0;i<n/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[n-1-i];
		arr[n-i-1]=temp;
	}
}
	public static void main(String[] args) {
		
		int arr[]= {225,5,45,4,6,3};
		
		System.out.println("Reverse array: ");
		
		Reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

}
