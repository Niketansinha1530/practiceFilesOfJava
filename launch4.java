package practiceJava;

public class launch4 {

	public static void main(String[] args) {
		
		int n=11;
		//Half pyramid question
	/*	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		*/	
		/*
			// inverted Half pyramid question
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j<=(n-1)/2 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
		}
		*/
		/*
			//hollow inverted half pyramid
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j==(n-1)/2 || i==0 && j<=(n-1)/2  || j==0 && i<=(n-1)/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
		}
*/
		//hollow full pyramid.
		/*
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	*/
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=(n-1)/2 && i+j>=(n-1)/2 && j-i <=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}

}
