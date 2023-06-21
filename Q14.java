package practiceJava;

import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
       System.out.println("Program Menu");
       System.out.println("1.Addition");
       System.out.println("2.Subtraction");
       System.out.println("3.Multiplication");
       System.out.println("4.Division");
       System.out.println("choose any no: ");
       int choose=scan.nextInt();
      System.out.println("Enter first NO: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no: ");
		int num2=scan.nextInt();
		
		
		switch(choose)
		{
		case 1:
			System.out.println("Addition = " +(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction = " +(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication = " +(num1*num2));
			break;
		case 4:
			System.out.println("Division = " +(num1/num2));
			break;
			default:
				System.out.println("Wrong operation");
				break;
		}
	}

}
