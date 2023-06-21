package practiceJava;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;




public class iteratorconcept {

	public static void main(String[] args) {
		
		//CopyOnWriteArrayList ar=new CopyOnWriteArrayList();
		ArrayList ar=new ArrayList();
		ar.add(50);
		ar.add(100);
		ar.add(150);
		ar.add(200);
		
		System.out.println(ar);
		
		Iterator itr=ar.iterator();
		
		while(itr.hasNext())
		{
			
			Integer i=(Integer) itr.next();
			System.out.println(i);
			//System.out.println(itr.next());
			//ar.add(500);//concurrency modification .fail safe approach
		}
		
		
		

	}
}
