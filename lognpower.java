package practiceJava;

import java.math.BigInteger;
import java.util.Scanner;

public class lognpower {


	public static BigInteger power(BigInteger n, int pow) {
		BigInteger result;
		if (pow == 1) {
			return n;
		}
//		if (pow == 0) {
//			return 1;
//		}
		result = power(n, pow / 2);
		BigInteger final_result = result.multiply(result);
		
		if(pow%2!=0)
		{
			return n.multiply(final_result);
		}

		return final_result;
	}

public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter any number=  ");
	BigInteger num = sn.nextBigInteger();
	System.out.println("Enter power of number= ");
	int pow = sn.nextInt();

	BigInteger result = power(num, pow);
	System.out.println("power of number= " + result);
}
}