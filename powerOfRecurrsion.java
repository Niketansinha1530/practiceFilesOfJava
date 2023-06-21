package practiceJava;

import java.util.Scanner;

public class powerOfRecurrsion {
	public static int power(int n, int pow) {
		int result = 0;
		if (pow == 1) {
			return n;
		}
		if(pow==0)
		{
			return 1;
		}
		
			result = n * power(n, pow-1);
		return result;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number=  ");
		int num = sn.nextInt();
		System.out.println("Enter power of number= ");
		int pow = sn.nextInt();

		int result = power(num, pow);
		System.out.println("power of number= " + result);
	}
}
