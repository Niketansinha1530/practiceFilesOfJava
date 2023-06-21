package practiceJava;

import java.util.Scanner;

public class PowerOfElements {

	public static int Power(int a,int b)
	{
		int result=0;
		if(b==1)
		{
			return a;
		}
		else {
			result=a*Power(a, b-1);
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number");
		int a=scn.nextInt();
		System.out.println("Enter the power of an number");
		int b=scn.nextInt();
		
		int result=Power(a,b);
		System.out.println("Value = "+result);
	}

}
