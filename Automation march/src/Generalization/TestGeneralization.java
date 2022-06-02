

package Generalization;

 
public class TestGeneralization {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Features of idea");
		Idea i=new Idea();
	
		i.audiocalling();
		i.sms();
		i.internet();
		i.newfeture();
		
		System.out.println("Features of Jio");
         jio j=new jio();
         j.audiocalling();
         j.internet();
         j.sms();
         j.newfeture();

	}

}
