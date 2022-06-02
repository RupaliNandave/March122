package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class _LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedHashSet lhs=new LinkedHashSet();
			lhs.add("Rupali");
			lhs.add('A');
			lhs.add(200);
			lhs.add("45.56F");
			lhs.add("TRUE");
			lhs.add(200);
			lhs.add(null);
			lhs.add(null);
			lhs.add('A');
			System.out.println(lhs);//[Rupali, A, 200, 45.56F, TRUE, null]
			System.out.println(lhs.size());//6
			System.out.println(lhs.isEmpty());//False
			System.out.println(lhs.contains(20));//False
			
			lhs.remove(null);
			System.out.println(lhs);
			//lhs.clear();
			//System.out.println(lhs);//[]
			
			
			System.out.println("Print all info from LinkedHashSet list using iterator---");
			
			 Iterator itr=lhs.iterator();
			 
			 while(itr.hasNext()){
				 System.out.println(itr.next());
				
			 }
			 System.out.println("---Print all info in array list using for each loop---");
			 for(Object lhs1:lhs) {
				 System.out.println(lhs1);
			
			 }
			

	}

}
