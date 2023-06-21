package practiceJava;

public class recurssionSumOfN {

	static int sum(int n)
	{
		int result=0;
		if(n==6)
		{
			return 0;
		}
		else {
			
			result=n+sum(n+1);
		}
		return result;
	}
	public static void main(String[] args) {
		
		int n=1;
		int result=sum(n);
		System.out.println("Result= "+result);

	}

}
