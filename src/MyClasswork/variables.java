package MyClasswork;

public class variables {
	int g = 10000;// global variables/non static global variables
	String name = "Swhizz";
	static int b = 100;//we can access the variable with out creating the object

	public static void main(String[] args) {
		int i = 20;
		int a = 40;//local variables

		System.out.println(i);
		System.out.println(a);
		variables ob=new variables();
		System.out.println(ob.g);
		System.out.println(ob.name);
		System.out.println(b);
		sum();

	}
	public static void sum() {
		System.out.println("sum method");
		int i =20;
		System.out.println(i);
	}
	

}
