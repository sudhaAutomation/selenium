package MyClasswork;

class ParentClass {
	public ParentClass() {// 0 params
		System.out.println("default constructor ParentClass");
	}

	public ParentClass(int i) {// 1 params
		//this();
		System.out.println(" ParentClass with int i " + i);
	}

	public ParentClass(int i, String S) {// 2 params
		System.out.println(" ParentClass with int i and String S are  " + i + " and " + S);
	}

}

class ChildClass extends ParentClass {// child class is extending with the parent class properties in the form
										// variables and methods(constructors)
	public ChildClass() {// 0 params
		//super();// 0c param

		// super keyword is used to call the parent constructor from the Child
		// Constructor
		System.out.println("default constructor ChildClass");
	}

	public ChildClass(int k) {// 1 parameter
		super(100);
		System.out.println("child class with int k " + k);
	}

	public ChildClass(int j, String str) {// 1 params
		super(200, "Software");
		System.out.println(" ChildClass with int i and String S are  " + j + " and " + str);
	}
}

public class superkeyword {// super keyword in the constructors

	public static void main(String[] args) {
		//new ChildClass();
		new ChildClass(10);
		new ChildClass(500, "Testing");
		// new ParentClass(200,"Software");
		// System.out.println("sample execution");

	}

}
// even though we have not create any object for class some default constructor
// will always available for every class
