package ExceptionHandling;

import Datatype.Arithmatic;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//	ArithmeticException
		//System.out.println(a);
		int a;
		try {
		a= 10/0;
		System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception");
			
			
		}catch(ArithmeticException e) {
			System.out.println(" Arithmatic Exception found");
			
		}catch( Exception e) {
			System.out.println("Exception found");
		
	}finally {
		System.out.println("Finally block get executed");
		
		
	}}}


