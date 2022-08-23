package Inheritance;

public class Jaguar extends singleinheritanceparent {

	public void jaguarEngine() {
		System.out.println("Jaguar engine designed successfully");
	}

	public void jaguardriver() {
		System.out.println("Jaguar  is ready to drive on road");
	}

	public void jaguarcolour() {
		System.out.println("Jaguar colour seslectgion completed");
	}
	public static void main(String[] args) {
		
		Jaguar jg=new Jaguar();
		jg.jaguardriver();
		jg.jaguarcolour();
		jg.jaguarEngine();
		jg.cardesign();
		jg.carparts();
		jg.carstart();
		jg.carstop();
	}

}
