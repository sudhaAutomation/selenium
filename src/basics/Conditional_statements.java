package basics;

public class Conditional_statements {

	public static void main(String[] args) {
		String Exptitle = "Welcome to Admin";
		String actTitle = "welcome to admin";
		String actTitle1 = "Admin";
		String actTitle2 = "Welcome Admin";
		
		if (Exptitle.equals(actTitle)) {// simple if condition
			System.out.println("login module working fine");
		}

		if (Exptitle.equalsIgnoreCase(actTitle)) {// if else condition
			System.out.println("login module working fine");
		} else {
			System.out.println("login got failed ");
		}

		// Nested if or else if
		if (Exptitle.equalsIgnoreCase(actTitle1)) {
			System.out.println("login module working fine");
		} else if(Exptitle.equalsIgnoreCase(actTitle)) {
			System.out.println("login module working fine in else if condition");
		}
		else if(Exptitle.equalsIgnoreCase(actTitle2)) {
			System.out.println("login module working fine ands showing Welcome admin");
		}
		else {
			System.out.println("login got failed ");
		}
	}

}
