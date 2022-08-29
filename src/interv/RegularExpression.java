package interv;

public class RegularExpression {

	public static void main(String[] args) {
		// regular Expression=[^a-zA-Z0-9]
		String snm = "^&%&^%^$Hyderabad and secunderabad are twin cities 0123456789";
		snm = snm.replaceAll("[^ a-zA-Z0-9]", "");
		System.out.println(snm);
	}

}
