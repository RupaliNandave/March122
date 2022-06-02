package Polymorphism;

public  class overloading {
           public static void main(String[]args) {
	
	overloading ol=new overloading();
	ol.addition();
	ol.addition(20);
	ol.addition(10,80);
	ol.addition(80,20,40);
	

}
public void addition() {
	int a=40;
	int b=50;
	System.out.println("Addition:"+(a+b));
}
public void addition(int a) {
	int b=40;
	int c=30;
	System.out.println("Addition:"+(b+c));
}
public void addition(int a,int b) {
	
	System.out.println("Addition:"+(a+b));
}
public void addition(int a,int b,int c) {
	
	System.out.println("Addition:"+(a+b+c));
}}