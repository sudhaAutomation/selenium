package constructor;

public class ConstructorChild extends Constructorparent {
	public ConstructorChild() {
		super();
		System.out.println("child class default constructor");
	}

	public ConstructorChild(int i) {
		super(200);
		
		System.out.println("child class 1 parameter constructor " + i);
	}

	public ConstructorChild(int i, String name) {
		super(50,"SwhizzTest");//constructor chaining
		System.out.println("child class 2 parameters constructor " + i + " " + name);
	}

	public static void main(String[] args) {
		new ConstructorChild();
//		new ConstructorChild(90);
//		new ConstructorChild(80, "Test");

	}

}//super keyword will be used to call the parent class constructors from the child class contructor
//this keyword will call the constructor with in the same class only
