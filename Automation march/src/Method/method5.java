package Method;

public class method5 {//non static method calling from same class

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
method5 m1=new method5();
m1.run();
m1.walk();
	}
	public void run() {
		System.out.println("running man");

	}
	public void walk() {
		System.out.println("walking man");
}
}