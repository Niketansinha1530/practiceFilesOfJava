package practiceJava;

import java.util.Arrays;

public class CopyArray {
static void printArray(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
	int arr[]= {5,8,3,4,6};
/*	
	printArray(arr);
	System.out.println("New copied array ");
	int arr_2[]=new int[arr.length];
	
	for(int i=0;i<arr.length;i++)
	{
		arr_2[i]=arr[i];
	}
	printArray(arr_2);
	arr_2[2]=245;
	printArray(arr_2);
	printArray(arr);
	*/
	//Now we have one clone method:
	/*
	int arr_3[]=arr.clone();
	printArray(arr_3);
	arr_3[2]=45;
	printArray(arr_3);
	printArray(arr);
	
	*/
	
	//Now we have another method:
	int arr_4[]=Arrays.copyOf(arr, arr.length);//Arrays.copyOfRange(arr,from: a,to: b);
	printArray(arr_4);
	}

}
