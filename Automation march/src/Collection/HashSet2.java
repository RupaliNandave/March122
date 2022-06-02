package Collection;

import java.util.ArrayList;
import java.util.HashSet;


public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList al=new ArrayList();
				al.add("Rupali");
				al.add('A');
				al.add("200");
				al.add("45.56F");
				al.add("TRUE");
				al.add("200");
				al.add(null);
				al.add(null);
				al.add('A');
				System.out.println(al);
				
				HashSet hs=new HashSet(al);
				System.out.println(hs);
				
				
	}

}
