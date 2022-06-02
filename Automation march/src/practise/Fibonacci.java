package practise;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //0 1 1 2 3 5 8 13
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=10;i++)
		{    
			c=a+b;
			System.out.println(c);//120
			a=b;
			b=c;

		}
			
		
	}

}
