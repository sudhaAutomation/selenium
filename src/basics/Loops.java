package basics;

public class Loops {

	public static void main(String[] args) {
		// loops:
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		// while
		System.out.println("while loops output");
		int i = 1;// initilisation
		while (i <= 10) {// condition part
			System.out.println("my value is " + i);
			i = i + 1;
			//i++;// incremental part...if u for get incfremental loop will repeat infinte times
		}

		
			
		System.out.println("do while loops output");
		int j = 1;// initilisation
		do {
			System.out.println("my value is " + j);
			j = j + 1;
			//i++;// incremental part
		}while (j <= 10);// condition part
		System.out.println("for loop output");
		
		for (int j2 = 0; j2 <=10 ; j2++) {
			System.out.println("for loop value "+j2);
		}
		
		
		
	}

}
