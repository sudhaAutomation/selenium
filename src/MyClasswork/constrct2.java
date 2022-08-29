package MyClasswork;

public class constrct2 {// example for the car show room to know how many different car model and clrs
						// available
	String name;//
	int model;
	String colour;

	// CONSTRUCTOR ALWAYS HAVING THE CLASS NAME ONLY AS A METHOD NAME
	public constrct2(String name, int model, String colour) {// 3 prametr

		this.name = name;// class variable = local varibles
		this.model = model;

		this.colour = colour;

		System.out.println(name + " " + model + " " + colour);
	}

	public static void main(String[] args) {
		new constrct2("BMW", 2020, "Red");
		new constrct2("audi", 2020, "black");
		new constrct2("jaguar", 2020, "grey");

		new constrct2("honda", 2022, "WHITE");
	}
	// can we over ride the constructor?
	// no....
	// constructor is having the same class name
}
