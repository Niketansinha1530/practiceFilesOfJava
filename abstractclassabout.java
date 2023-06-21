package practiceJava;

 abstract class engine66
{
	public void cluch()
	{
		System.out.println("I am clutch");
	}
	public void break1()
	{
		System.out.println("I am break");
	}
	abstract public void excel();
}
 class car55 extends engine66
 {
	 public void excel()
	 {
		 System.out.println("hi i am excel");
	 }
 }
public class abstractclassabout {
public static void main(String[] args) {
	car55 ck=new car55();
	ck.cluch();
	ck.break1();
	ck.excel();
}
}
