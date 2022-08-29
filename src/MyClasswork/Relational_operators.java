package MyClasswork;

public class Relational_operators {

	public static void main(String[] args) {
		// Relational operators:>,<,>=,<=,!=,==
		int a = 100;
		int b = 200;
		int d=200;
		int c = 300;
		String name = "swhizz";
		String name2 = "Swhizz";
		boolean compare = a > b; // <data type> <variable name>
		System.out.println("a>b is " + compare);
		boolean compare1 = c > b; // true
		System.out.println("c>b is " + compare1);
		boolean compare2 = name == name2;// =&==
		System.out.println("name are matched " + compare2);
		//<
		boolean compare3 = a < b; //true
		System.out.println("a<b is "+compare2);
		boolean example=compare==compare1;
		System.out.println(example);
		//>=
		boolean  cmp=b>=a;
		System.out.println(cmp);//true
		boolean cmp1=b>=d;
		System.out.println(cmp1);//true
		if (name.equalsIgnoreCase(name2)) {
			System.out.println("both the names are same");
		} else {
			System.out.println("both the names are not same");
		}
if (a==b & d==b) {
	System.out.println("b is similR TO n other variable");
} else {
System.out.println("b is not same with any value");
}
	}

}
