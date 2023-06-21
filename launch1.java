package practiceJava;
import java.util.Scanner;
public class launch1 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a=scan.nextInt();
		System.out.println("Enter second Number: ");
		int b=scan.nextInt();
		System.out.println("Enter operation: ");
		char op=scan.next().charAt(0);
		
		switch (op) {
		case '+': {
			System.out.println("Addition: "+ (a+b));
			break;
		}
		case '-': {
			System.out.println("Subtraction: "+ (a-b));
			break;
		}
		case '*': {
			System.out.println("Addition: "+ (a*b));
			break;
		}
		case '/': {
			System.out.println("Addition: "+ (a/b));
			break;
		}
		default:
			System.out.println("Not match with your opeartion: ");
		}
	}

}
