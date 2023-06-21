package practiceJava;

class employee3
{
	 private String name;
     private int id;
	 private String department;
	 public void setname(String name)
		{
			this.name=name;
		}
		public void setid(int id)
		{
			this.id=id;
		}
		public void setdepartment(String department)
		{
			this.department=department;
		}
		public String getname()
		{
			return name;
		}
		public String getdepartment()
		{
			return department;
		}
		public int getid()
		{
			return id;
		}

	
	}
public class setterandgetter {

	public static void main(String[] args) {

employee3 e1=new employee3();

e1.setname("ram");
e1.setdepartment("manager");
e1.setid(25);

String name=e1.getname();
String department=e1.getdepartment();
int id=e1.getid();
System.out.println(name);
System.out.println(department);
System.out.println(id);



	}

}
