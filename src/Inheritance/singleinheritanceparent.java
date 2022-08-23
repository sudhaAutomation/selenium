package Inheritance;

public class singleinheritanceparent extends Vehicle {
	int cost = 3000000;

	public void carstart() {
		System.out.println("car start method");
	}

	public void carstop() {
		System.out.println("car stop method");
	}

	public void carparts() {
		System.out.println("carparts building method");
	}

}
