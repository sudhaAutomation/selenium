package polymorphism1;

public class ParentClass   {
	int i;
	public void sum() {
		System.out.println("parent sum method with 0 arguments");
	}

	public void sum(int i) {
		System.out.println(" parent sum method with int arguments  " + i);
	}

	public void pro(int i, int j) {
		System.out.println("  parent pro of i and j is " + (i * j));
	}
	public void mul() {
		System.out.println("parent mul method output");
	}

//	public static void main(String[] args) {
//		ParentClass ob = new ParentClass();
//
//		ob.sum();
//		ob.sum(100);
//
//	}

}
