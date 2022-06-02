
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Rupali");
		al.add('A');
		al.add("200");
		al.add("45.56F");
		al.add("TRUE");
		al.add("200");
		al.add("NULL");
		System.out.println(al);
		System.out.println(al.get(2));//200
		//MODIFY/Replace--> set
		al.set(6, "Quantum Academy");
		System.out.println(al); //[Rupali, A, 200, 45.56F, TRUE, 200, Quantum Academy]
		
		System.out.println(al.size());//7
		System.out.println(al.isEmpty());//False
		System.out.println(al.contains("200"));//true
		
		//insert info in between array list--> right shift operation
		al.add(1,"Pune");
		System.out.println(al.get(1));//Pune
		System.out.println(al);// [Rupali, Pune, A, 200, 45.56F, TRUE, 200, Quantum Academy]
         
		//delete info in between array list--->left shift operation
		
		al.remove(1);
		System.out.println(al.get(1));//A
		System.out.println(al.get(2));//200
		System.out.println(al);
		
		System.out.println("Print all info in array list using iterator---");
		
		 Iterator itr= al.iterator();
		 
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 System.out.println("---Print all info in array list using list iterator---");
		 ListIterator litr=al.listIterator();
		 while(litr.hasNext()) {
			 System.out.println(litr.next());
		 }
			 
			 
			 System.out.println("---Print all info in array list using for loop---");
			for(int i=0; i<=al.size()-1;i++) {
				 System.out.println(al.get(i));
			 }
			 System.out.println("---Print all info in array list using for each loop---");
			 for(Object s1:al) {
				 System.out.println(s1);
				 
				 
				 
			 
	} }
}		 

			 
			 
			 
		 
		 
		 

		
		
		
	
		
		
		
		
		
	


