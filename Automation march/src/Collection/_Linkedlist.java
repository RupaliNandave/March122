package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll=new LinkedList();
		ll.add("Rupali");
		ll.add('A');
		ll.add(200);
		ll.add("45.56F");
		ll.add("TRUE");
		ll.add(200);
		ll.add("NULL");
		ll.add("NULL");
		System.out.println(ll);//[Rupali, A, 200, 45.56F, TRUE, 200, NULL, NULL]
		System.out.println(ll.size());//8
	
		System.out.println(ll.get(0));//Rupali
		System.out.println(ll.contains(20));//False
		//ll.clear();
		System.out.println(ll.isEmpty());//true
		//Insert data in between linkedlist--> right shift 
		ll.add(1, "QA");
		System.out.println(ll.get(1));//QA
		System.out.println(ll.get(2));//A
		
		//remove data from linkedlist-->left shift 
		ll.remove(3);
		System.out.println(ll.get(3));//45.56F
		//modify/update/replace
		ll.set (2,300);
		System.out.println(ll);//45.56F
		
		 System.out.println("---Print all info in array list using for each loop---");
		 for(Object ll1:ll) {
			 System.out.println(ll1);
		 }
		 
		 
		 
		 System.out.println("---Print all info in array list using for loop---");
		for(int i=0; i<=ll.size()-1;i++) {
			 System.out.println(ll.get(i));
		}
		
		System.out.println("Print all info in array list using iterator---");
		
		 Iterator itr= ll.iterator();
		 
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("---Print all info in array list using list iterator---");
		 ListIterator litr=ll.listIterator();
		 while(litr.hasNext()) {
			 System.out.println(litr.next());
		 }
		
		
		
		
	}

}
