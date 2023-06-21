package practiceJava;

public class STring {

	public static void main(String[] args) {
	final	StringBuffer sb=new StringBuffer("viral");
		sb.append("_videos");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.charAt(0));
	//	sb=new StringBuffer("sujata");
		sb.append('a');
		System.out.println(sb);
		String s="raj";
		s="ram";
		System.out.println(s);
	StringBuffer sb1=new StringBuffer("Sachin");
	System.out.println(sb1);
	
	sb1.setCharAt(1, 'A');
	System.out.println(sb1);
	}
}
