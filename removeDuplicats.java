package practiceJava;

public class removeDuplicats {

	public static void main(String[] args) {
		String s="aabbcc";
		char ar[]=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<ar.length;i++)
		{int repeat=0;
			for(int j=i+1;j<ar.length;j++)
			{
				
				if(ar[i]==ar[j])
				{
					repeat=1;
					break;
				}
			}
			if(repeat==1) {
				sb.append(ar[i]);
			}
		}
		System.out.println(sb);
	}
}
