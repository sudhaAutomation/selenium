package constructor;

public class Constructor {// why we need to use ?...to initialise the instanc variable in the class

	int i;
	String name;
	short s;
	double d;

	// public void sum() {}
	// public sub() {}
	public Constructor() {
		// it is a special method in a class ,which method name is same as class name
		// constructor is not void type
		// construvtor is a non static
		// constructor is can not abstract method
		// we no need to call the constructor manually,always a class contains invisibly
		// default constructor
		this(200, "Swhizz");
		System.out.println("default constructor");

	}
	// 2 types
	// 1.default constructpor
	// 2.parameterised constructor

	// can we overload the constructor?
	public Constructor(int i) {

		System.out.println("1 parameter constructor " + i);
	}

	public Constructor(int i, String name) {
		this(100);// this keyword will call the constructor which is available in the same class
		// this keyword should the first stestement in the cobstructor
		System.out.println("2 parameter constructor " + i + "  " + name);
	}

	public static void main(String[] args) {
		 new Constructor();// by instantiation of the class with the new keyword we can create an object
		new Constructor(100);
		new Constructor(1000, "swhizz techno");

		// System.out.println(ob.i);
		// System.out.println(ob.name);
		// System.out.println(ob.s);
		// System.out.println(ob.d);

	}

}//can we override the constructor?
//can u inherit the properties of the constructor? yes
