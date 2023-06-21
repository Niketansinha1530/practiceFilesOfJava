package practiceJava;

import java.util.Scanner;

public class EvenOddBinary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=scn.nextInt();
		if((num&1)==0)
		{
			System.out.println("Even Number ");
		}
		else {
			System.out.println("Odd Number ");
		}
	}
}
