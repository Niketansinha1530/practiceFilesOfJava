package practiceJava;

interface car23 {
	void drive();
}
/*
class bmw11 implements car23 
{
	public void drive() {
		System.out.println("Lets drive");
	}

}
*/
public class functionalInterface {
	public static void main(String[] args) {
		car23 obj = ()->System.out.println("Lets drive");
		
		
//		bmw11 obj=new bmw11();
	obj.drive();
	}


}
