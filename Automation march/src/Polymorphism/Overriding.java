package Polymorphism;

public class Overriding {

	public static void main(String[] args) {
		GoodNight gn= new GoodNight();//run time polymorphism
		gn.wish();//good night

		GoodMorning gm= new GoodMorning();
		gm.wish();//good morning
	}

}
