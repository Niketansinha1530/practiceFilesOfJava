package practiceJava;
import java.util.*;
//import javax.swing.text.html.HTMLDocument.Iterator;
public class priortyqueue {

	public static void main(String[] args) {
		
		PriorityQueue pp=new PriorityQueue();
		
		pp.add(100);
		pp.add(200);
		pp.add(300);
		pp.add(400);
		
	java.util.Iterator itr= pp.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	ArrayList ar=new ArrayList();
	
	ar.addAll(pp);
	System.out.println(ar);
//	
//	ListIterator itr2=ar.ListIterator(ar.size());
//	
//	while(itr2.hasPrevious())
//	{
//		System.out.println(itr2.previous());
//	}
//	
	}
}
