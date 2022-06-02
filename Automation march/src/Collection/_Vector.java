package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("Rupali");
		v.add('A');
		v.add("200");
		v.add("45.56F");
		v.add("TRUE");
		v.add("200");
		v.add("NULL");
		v.add("NULL");
		System.out.println(v);//[Rupali, A, 200, 45.56F, TRUE, 200, NULL, NULL]
		System.out.println(v.size());//8
		System.out.println(v.isEmpty());//False
		System.out.println(v.capacity());//10
		System.out.println(v.get(0));//Rupali
		System.out.println(v.contains(20));//False
		
		//modify/replace/update
		v.set(1, 'B');
		System.out.println(v);//B
		
		//insert info in between vector--> right shift operation
		
		v.add(2, 400);
		System.out.println(v.get(2));//400
		System.out.println(v.get(3));//200
		System.out.println(v.size());//9
		
		//delete info in between vector--> left shift operation
		v.remove(3);
		System.out.println(v);//200
		
		System.out.println("Print all info in array list using iterator---");
		
		 Iterator itr= v.iterator();
		 
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("---Print all info in array list using list iterator---");
		 ListIterator litr=v.listIterator();
		 while(litr.hasNext()) {
			 System.out.println(litr.next());
		 }
		 System.out.println("---Print all info in array list using Enumeration---");
		 
		 Enumeration en=v.elements();
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
		 System.out.println("---Print all info in array list using for each loop---");
		 for(Object v1:v) {
			 System.out.println(v1);
			 
		 }
		
		
		

		
		
		

	}}


