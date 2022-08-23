package basics;

public class Variables {
	int i = 10;//instance variables/global variables/class variables
String s="Test";

static int g=90;

	public static void main(String[] args) {
		// Variables:memory alloaction
		// locval varibles
		// instance variables/global variables/class variables
		// static variables
		
		Variables obj=new Variables();//object
		int i = 100;
		int j = 200;// locval varibles
		int k = i - j;// expression
		System.out.println("substarction of i and j is " + k);// statement
		System.out.println(obj.s);
		System.out.println(obj.i);
		pro();
		obj.sum();
		System.out.println("static variable "+g);
	}

	public void sum() {
		int i = 100;
		int j = 200;// locval varibles
		int k = i + j;// expression
		System.out.println("sum of i and j is " + k);
	}

	public static void pro() {
		int i = 100;// locval varibles
		int j = 200;
		int k = i * j;// expression
		System.out.println("product of i and j is" + k);
	}
}
