package practiceJava;

public class calculateFibnacci {
	public static void cal(int a, int b, int n)
	{if(n==0)
	{
		return ;
	}
	int c=a+b;
	System.out.println(c);
	cal(b,c,n-1);
		
	}
public static void main(String[] args) {
	
	int a=0 ,b=1;
	System.out.println(a);
	System.out.println(b);
	int num=7;
	cal(a,b,num-2);
	
}
}
