package polymorphism;

public class methodoverloading {// with in the same class, if we write the same method name with different
								// arguments,different order of arguments,different data types of the arguments
								// ,that method we call method over laoding
//static polymorphism
	public void sum() {
		System.out.println("sum method with 0 arguments");
	}

	public void sum(int i) {
		System.out.println("sum method with int arguments  " + i);
	}

	public void sum(int i, String name) {
		System.out.println("sum method with int and String arguments  " + i+"  " + name);
	}

	public void sum(int i, String name, int j) {
		System.out.println("sum method with int and String and int  arguments  " + i+"  "  + name+"  "  + j);
	}

	public void sum(int k, int l, String name) {
		System.out.println("sum method with int and String and int  arguments  " + k+"  "  + name+"  "  + l);
	}

	public static void main(String[] args) {
		methodoverloading ob=new methodoverloading();
		
		
		ob.sum();
		ob.sum(100);
		ob.sum(200, "Testing");
		ob.sum(300, 400, "Swhizz");
		ob.sum(500, "Technologies",600);
	}
	
}
