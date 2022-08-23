package constructor;

public class Constructorparent {

	public Constructorparent() {
		//this(100);
		System.out.println("Parent class default constructor");
	}

	public Constructorparent(int i) {
		//this(200,"Course");
		System.out.println("Parent class 1 parameter constructor " + i);
	}

	public Constructorparent(int i, String name) {

		System.out.println("Parent class 2 parameters constructor " + i + " " + name);
	}

	public static void main(String[] args) {

	}

}
