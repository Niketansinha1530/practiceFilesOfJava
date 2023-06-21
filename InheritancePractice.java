package practiceJava;

class Route66
{
	 public String name="Meri Mclerene";
	 public int no=0001;
	 public void  featuresCar()
	 {
		 System.out.println("Car Name= " +name);
			System.out.print("No=" +no);
	 }
	

}
class car extends Route66
{
	
}
public class InheritancePractice {

	public static void main(String[] args) {
		
		car c1=new car();
		c1.featuresCar();

	}

}
