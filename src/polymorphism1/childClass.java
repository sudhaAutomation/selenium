package polymorphism1;

public class childClass extends ParentClass {// with in the same class, if we write the same method name with different
	// arguments,different order of arguments,different data types of the arguments
	// ,that method we call method over laoding
	// static polymorphism
	public void sum() {
		System.out.println(" child sum method with 0 arguments");
	}

	public void sum(int i) {
		System.out.println("child sum method with int arguments  " + i);
	}

	public void pro(int i, int j) {
		System.out.println(" child pro of i and j is " + (i * j));
	}

	public void div() {
		System.out.println("child Div method output");
	}

	public static void main(String[] args) {
		ParentClass ob = new childClass();// child class object can be reffred by the parent calss reference variable

		ob.sum();
		ob.sum(100);
		ob.pro(100, 1000);
		ob.pro(300, 500);
		ob.mul();
		// ob.div();//we can only call the common methods to the parent calss with the
		// child class,
		// we can,t call all the child class methods

		// method overridding:parent class methods will be over ride by the child class
		// methods,
		// while running the programming the JVM will decide the method wwhich need to
		// execute and iver ride,we are calling ita dynamic polymorphism
		
		//dynamic polymorphism is also called run time polymorphism
		
		
		
		//multiple inheritance with the classes is not possible in java
		//
	}

}
