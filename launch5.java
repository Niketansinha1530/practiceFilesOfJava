package practiceJava;
import java.util.Scanner;
public class launch5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter Numbers in array: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("array index "+i +"= "+arr[i]);
		}
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		System.out.println("No of Duplicates: =" +count);
		
	/*	//reverse order 
		System.out.println("Reverse order of array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("arr at "+i +"= "+arr[i]);
		}
		//sum of all element in array
		System.out.println("Sum of all element in array: ");
		int sum=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum= "+sum );

		//copy a array into another array
		int arr2[]=new int[5];
		System.out.println("copy array");
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("arr at "+i +"= "+arr2[i]);
		}
		*/
	}

}
