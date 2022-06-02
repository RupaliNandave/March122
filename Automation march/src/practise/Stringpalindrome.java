package practise;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mam";//same as like rev string
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
if(s.equals(rev)) {
	System.out.println("String is palindrome");
}
else {
	System.out.println("String is not palindrome");
}
	}

}
