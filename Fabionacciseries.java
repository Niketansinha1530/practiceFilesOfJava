package practiceJava;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Fabionacciseries {

	public static int Fab(int n)
	{
		int result=0;
	
		if(n==0||n==1)
		{
			return n;
		}
		else {
			result=Fab(n-1)+Fab(n-2);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number ");
		int n=scn.nextInt();
		
		int result=Fab(n);
		System.out.println("output= "+result);
		
		

	}

}
