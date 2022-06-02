package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(45);
		ts.add(78);
		ts.add(10);
		ts.add(25);
		ts.add(200);
		//ts.add(null);//nullpointerException
		
		System.out.println(ts);//[10, 25, 45, 78, 100, 200]
		System.out.println(ts);//[Rupali, A, 200, 45.56F, TRUE, null]
		System.out.println(ts.size());//6
		System.out.println(ts.isEmpty());//False
		System.out.println(ts.contains(20));//False
		
		ts.remove(200);
		System.out.println(ts);
		System.out.println(ts.first());//10--> to get 1st element from treeset
		System.out.println(ts.last());//100--> to get last element from treeset
		ts.pollFirst();
		System.out.println(ts);//[25, 45, 78, 100]//deletes first element
		ts.pollLast();
		System.out.println(ts);//[25, 45, 78]//delete last element
		
		System.out.println("---Print all info in treeset using iterator cursor---");
		 Iterator itr=ts.iterator();
		 
		 while(itr.hasNext()){
			 System.out.println(itr.next());
			
		 }
		 System.out.println("---Print all info in treeset using for each loop---");
		 for(Object ts1:ts) {
			 System.out.println(ts1);
		
			 System.out.println("---Print all info in from treeset by descending order---");
			 Iterator ditr= ts.descendingIterator();
			 while(ditr.hasNext()){
				 System.out.println(ditr.next());
			 
		
		
		
		
		

	}}}}


