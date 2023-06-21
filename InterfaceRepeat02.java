package practiceJava;

class computer
{
	void compilecode()
	{
		
	}
	
}
class Laptop extends computer
{
	void compilecode()
	{
		System.out.println("You got 5 error");
	}
	
}
class Desktop extends computer
{
	void compilecode()
	{
		System.out.println("You got 5 error,faster");
	}
	
}

class developer
{
	
	void BuildApp(computer obj)
	{
		System.out.println("Building APP For You");
		
		obj.compilecode();
		
	}
}
public class InterfaceRepeat02 {

	public static void main(String []args)
	{
		Desktop obj1=new Desktop();
		Laptop obj=new Laptop();
		developer dv=new developer();
		dv.BuildApp(obj1);
	}
}
