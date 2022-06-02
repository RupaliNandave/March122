package Method;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Example8 ex8=new Example8();
 ex8.addition();
 ex8.substrction(30, 20);
	}
public void addition() {//method without parameter/zero parameter
	
	int a =100;
	int b =200;
	int c= a+b;
	System.out.println("Addition:"+c);
}
public void substrction(int a,int b) {//method with parameter/zero parameter
	int c= a-b;
	System.out.println("Substraction:"+c);
	
}
}
