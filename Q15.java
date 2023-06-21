package practiceJava;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int num=scan.nextInt();
		int n2=1,n3,n1=0;
		
		for(int i=0;i<num;i++)
		{
		n3=n2+i;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
		
	}

}
