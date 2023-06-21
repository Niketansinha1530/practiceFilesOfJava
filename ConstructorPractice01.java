package practiceJava;
class school
{
	private String name;
	private int no;
	
	public school()
	{
		name="Rd Public school";
		no=15;
		System.out.println("Name="+ name);
		System.out.println("NO= "+no);
	}
	public school(String name,int no)
	{
		
		System.out.println("Name="+ name);
		System.out.println("NO= "+no);
	}
}
public class ConstructorPractice01 {

	public static void main(String[] args) {
		
		school s1=new school();
		school s2=new school("Shree,Radhey public school",25);
		
		
	}
}
