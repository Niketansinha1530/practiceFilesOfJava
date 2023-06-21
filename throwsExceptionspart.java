package practiceJava;

class demo
{
	public void a()throws Exception
	{
		b();
	}
	public void b()throws Exception
	{
		int num=12;
		int num2=0;
		int result=0;
		result=num/num2;
		System.out.println("Result= "+result);
	}
}
public class throwsExceptionspart {

	public static void main(String[] args) {
		demo d=new demo();
		try
		{
			d.a();
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs "+e.getMessage());
		}
	}

}
