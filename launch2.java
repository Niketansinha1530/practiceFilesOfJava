package practiceJava;
import java.util.*;
public class launch2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter temperature in Celcius: ");
		float Cel=scan.nextFloat();
		double far=Cel*9/5+ 32;
		
		System.out.println("Temperature in farhenheit = "+far);
		
		
	}

}
