package practiceJava;

class mom
{
	String name;
	int mob;
	
	public void setdata()
	{
	    name="neeta";
		mob=8130;
	}
	public void show()
	{
		System.out.println(name+ " ," + mob);
	}
}
public class getterandsetter {

	public static void main(String[] args) {
		
		mom m=new mom();
		m.setdata();
		m.show();
	}

}
