package practiceJava;
import java.util.*;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter first NO: ");
		int num1=scan.nextInt();
		System.out.println("Enter second no: ");
		int num2=scan.nextInt();
		System.out.println("Enter operation.");
		char op=scan.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.println("Addition = " +(num1+num2));
			break;
		case '-':
			System.out.println("Subtraction = " +(num1-num2));
			break;
		case '*':
			System.out.println("Multiplication = " +(num1*num2));
			break;
		case '/':
			System.out.println("Division = " +(num1/num2));
			break;
			default:
				System.out.println("Wrong operation");
				break;
		}
	}

}
