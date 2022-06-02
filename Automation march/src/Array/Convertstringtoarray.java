package Array;

public class Convertstringtoarray {

	public static void main(String[] args) {
		String s1="Quan tum Acad emy";
		String ar[]=s1.split(" ");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		String ar1[]=s1.split("a",4);
		System.out.println(ar1[0]);//Qu
		System.out.println(ar1[2]);//
		 String s2="Quantum Academy";
		 char[] charArray=s2.toCharArray();
		 
		 //for each loop
		 for(char c: charArray) {
		 System.out.println(c);
		
		
		
		
	

	}

}}
