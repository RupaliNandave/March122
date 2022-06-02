package String;

public class String_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rupali Nandave";
		String s2="Rupali Nandave";
		String s3="rupali nandave";
		String s4= "Nandave";
		
		//equals--> true/false
		System.out.println(s1.contains(s2));//true
		
		//equal ignore case
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.compareTo(s2));//0=equals
		//length---> no.of characters in string(space is also considered as character)
		System.out.println(s1.length());//14
		
		//Compare two string
		System.out.println(s1.equals(s2));//true
		//to lower case
		System.out.println(s1.toLowerCase());
		//to upper case
		System.out.println(s1.toUpperCase());
		
		//is empty
		System.out.println(s1.isEmpty());//false
		
		//contains
		System.out.println(s1.contains(s4));//true
		
		//starts with
		System.out.println(s1.startsWith("Rupali"));//true
		
		//ends with
		System.out.println(s1.endsWith("V"));//FAlse
		
		//charAt
		System.out.println(s1.charAt(2));//P
		
		//replace

		System.out.println(s2.replace('R', 'D'));//Dupali Nandave
		
		System.out.println(s2.replaceFirst("Dupali", "Rupali"));
	
		//substring
		System.out.println(s2.substring(8,14));//endindex--> actual endindex+1- andave
		
		System.out.println(s2.substring(5));//endindex--> actual endindex+1
		//lastindexOf
		System.out.println(s2.lastIndexOf('a'));//11
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
