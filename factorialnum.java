package practiceJava;

import java.util.Scanner;

public class factorialnum {
	public static int Fact(int num)
	{
		int result=0;
		if(num==0||num==1)
		{
			return 1;
		}
		else
		{
		result= num*Fact(num-1);
		}
		
		return result;
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Any Number ");
	int num=scn.nextInt();
	
	int result=Fact(num);
	System.out.println("Factorial of given Number = "+result);
}
}
