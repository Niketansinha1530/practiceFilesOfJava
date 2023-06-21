package practiceJava;

import java.util.Scanner;

class employee
{
	int Id_no;
	String name;
	String Department;
	int Salary;
	double HRA;
	double CCA;
	double NetSal;
	
	void setInfo()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id no: ");
		Id_no=scan.nextInt();
		System.out.println("Enter name: ");
		name=scan.next();
		System.out.println("Enter Department: ");
		Department=scan.next();
		System.out.println("Enter your salary: ");
		Salary=scan.nextInt();
	}
	void compute()
	{
		HRA=0.1*Salary;
		
		CCA=(0.05*Salary);
		
		NetSal=Salary+HRA+CCA;		
	}
	void output()
	{
		System.out.println("Id no: "+Id_no);
		
		System.out.println("Name: "+name);
		
		System.out.println("Department:  "+Department);
		
		System.out.println(" salary: "+Salary);
		
		System.out.println("HRA= "+HRA);
		System.out.println("CCA= "+CCA);
		System.out.println("NetSalary= "+NetSal);
	}
	
}
public class launch3 {
	

public static void main(String[] args) {
	employee emp1=new employee();
	emp1.setInfo();
	emp1.compute();
	emp1.output();
}
}

