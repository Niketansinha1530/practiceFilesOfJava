package practiceJava;
import java.util.*;
public class Q13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
System.out.println("Enter any charachter");
		char ch=scan.next().charAt(0);
		
		if(ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i' || ch=='I' ||  ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			System.out.println("It is vowel = "+ch);
		}
		else {
			{
				System.out.println("It is consonant = "+ch);
			}
		}
	}

}
