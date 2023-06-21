package practiceJava;

import java.util.Scanner;

public class SquareRoot {
	public static int root(int n) {
		int low = 0;
		int high = n;
		int result=0;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			 int val=mid*mid;
			
			if(val==n)
			{
				return mid;
			}
			else if(val<n)
			{
				result=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n = sn.nextInt();

		int result = root(n);
		System.out.println("Output= " + result);

	}

}
