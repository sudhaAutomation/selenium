package MyClasswork;

public class Conditional_statements {

	public static void main(String[] args) {
		//if else conditional
		int i=100;
		int j=1000;
		int k=200;
		String name="Testing";
		System.out.println("output with if else statement");
		if(i==j ) {
			System.out.println("i and j are holding the same values");
		}
		else {
			System.out.println("i and j are not holding the same values");
		}
		
		//else if//nested if statement
		System.out.println("output with elseif statement");
		if(i!=j ) {
			System.out.println("i and j are holding the same values");
		}
		else if( i>j) {
			System.out.println("i and j are not holding the same values");
		}
		else if(i==j &k>j) {
			System.out.println("i and j are holding the same values and k>j");
		}
		
		else {
			System.out.println("i and j are not holding the same values");
		}
		System.out.println("output with switch statement");
		switch(j) {
		case 10:
			System.out.println("100 and 10 are not same");
			break;
		case 20:
			System.out.println("100 and 20 are not same");
			break;
		case 1000:
			System.out.println("100 and case 100 is same");
			break;
			
			default:
				System.out.println("all cases are failed with int i");
		}
		switch(name) {
		case "qtp":
			System.out.println("qtp course is availble");
			break;
		case "saleforce":
			System.out.println("saleforce course is availble");
			break;
		case "t"
				+ "esting":
			System.out.println("Testing course is availble");
			break;
			
			default:
				System.out.println("all cases are failed with name");
		}
	
	
	}

}
