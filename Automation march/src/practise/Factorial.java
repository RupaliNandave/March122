package practise;

public class Factorial {

	public static void main(String[] args) {
		//factorial=5*4*3*2*1=120
            
		int no=5;
		int fact=1;
		for(int i=1;i<=no;i++) {
			
			fact=fact*i;
		}
		
		System.out.println(fact);//120
	}

}
