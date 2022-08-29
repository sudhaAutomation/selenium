package Inheritancce;

public class method_over_loading {// within the same class,if we write the same method name with different
									// arguments/different data types/order of dta types.

	public static void main(String[] args) {
		method_over_loading obj = new method_over_loading();
		obj.sum();
		obj.sum(100);
		obj.sum(10, 20);
		obj.sum("Swhizz", 1);
	}

	public void sum()// 0 input parameters/arguments
	{
		System.out.println("sum method with 0 parameters");
	}

	public void sum(int i )// 1 input parameters/arguments
	{
		System.out.println("sum method with 1 parameter");
		System.out.println(i);
	}

	public void sum(int i, int j)// 2 input parameters/arguments
	{
		System.out.println("sum method with 2 parameters");
		System.out.println("sum of i and j is " + (i + j));
	}

	public void sum(String s, int j)// 2 input parameters/arguments
	{
		System.out.println("sum method with 2 parameters with different data types");
		System.out.println("String concatenation is " + (s + j));
	}
	public void sum(int s, String j)// 2 input parameters/arguments
	{
		System.out.println("sum method with 2 parameters with different data types");
		System.out.println("String concatenation is " + (s + j));
	}

}
