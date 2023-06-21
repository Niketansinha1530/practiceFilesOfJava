package practiceJava;

interface raj
{
	 void disp();
}
class kumar
{
	void show()
	{
		System.out.println("showing ... ");
	}
}
class rajkumar extends kumar implements raj
{
	 public void disp()
	{
		System.out.println("display");
	}
}
public class interfaceAndImplementation {

	public static void main(String[] args) {
		
		rajkumar obj=new rajkumar();
		obj.disp();
		obj.show();

	}

}
