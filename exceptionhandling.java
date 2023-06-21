package practiceJava;

public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*    try 

        {

             int a, b;

             b = 0;

             a = 5 / b;

            System.out.print("A");

         }

         catch(ArithmeticException e) 

         {

     System.out.print("B");        

         }*/
	    
	     try 

         {

             System.out.print("Hello" + " " + 1 / 0);

         }

         catch(ArithmeticException e) 

          {

     System.out.print("World" + e.getMessage());        

         }
	}

}
