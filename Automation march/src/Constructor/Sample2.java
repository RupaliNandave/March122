package Constructor;

public class Sample2 {
	int id;
	String name;
	
	void display() {
		System.out.println(id+""+name);}


	public static void main(String[] args) {
		Sample2 s2=new Sample2();
		
		Sample2 s3=new Sample2();
		s2.display();
		s3.display();
	
		
		}

	}


