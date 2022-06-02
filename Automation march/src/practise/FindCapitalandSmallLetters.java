package practise;

public class FindCapitalandSmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="Welcome To Tutorials";
 int upper=0;
 int lower=0;
 
 for(int i=0;i<s.length();i++) {
	 char ch=s.charAt(i);
	 if (ch>='A'&& ch<='Z')
		 upper++;
	 else if(ch>='a'&& ch<='z') {
		 lower++;
		 
	 }
 }
 System.out.println("Lower case letter: "+lower);
 System.out.println("Upper case letter: "+upper);
	}

}
