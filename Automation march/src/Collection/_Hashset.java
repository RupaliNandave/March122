package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class _Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashSet hs=new HashSet();
    hs.add("Quantum Academy");
	hs.add('A');
	hs.add(200);
	hs.add("45.56F");
	hs.add("TRUE");
	hs.add(200);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);//[A, 200, NULL, 45.56F, TRUE, Quantum Academy]//Duplicate values not allowed.
	System.out.println(hs.size());//6
	System.out.println(hs.contains(200));//true
	System.out.println(hs.isEmpty());//false
	
	hs.remove(null);
	System.out.println(hs);//
	//hs.clear();
	//System.out.println(hs);//[]
	//System.out.println(hs.size());//0
	
	System.out.println("Print all info in array list using iterator---");
	
	 Iterator itr= hs.iterator();
	 
	 while(itr.hasNext()){
		 System.out.println(itr.next());
	 }
	
	 System.out.println("---Print all info in array list using for each loop---");
	 for(Object hs1:hs) {
		 System.out.println(hs1);

	}
	
		System.out.println("Print all info in array list using list iterator---");
		
		 Iterator it= hs.iterator();
		 
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }}

}
