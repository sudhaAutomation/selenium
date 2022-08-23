package basics;

public class Strings {

	public static void main(String[] args) {
		String name = "swhizz";
		String name2 = new String("swhizz Technologies");
		// System.out.println(name);//String literal
		System.out.println(name2);// by new keyword
		name = "   swhizz institute in madhapur ";// String is immutable
		System.out.println(name);

		name2 = "   swhizz Institute  ";
		String name3 = " SWHIZZ INSTITUTE";
		System.out.println(name2);

		// .length
		// charAt
		// indexOf
		// trim
		// replace
		// split
		// equals
		// compareTo
		// equalsignorecase
		// ToUpperCase
		// ToLowerCase
		// concat
		// contains
		System.out.println(name.length());// 16
		System.out.println(name.charAt(3));// i
		System.out.println(name.indexOf('i'));// 3..1st occurence of the i
		System.out.println(name.indexOf('i', 4));// 7..2st occurence of the i
		System.out.println(name.indexOf('i', name.indexOf('i') + 1));// 7..2st occurence of the i
		System.out.println(name.indexOf('i', name.indexOf('i', name.indexOf('i') + 1) + 1));// ..3rd occurence of the i

		System.out.println(name.indexOf('g'));// -1
		System.out.println(name.trim());
		String date = "14/07/2022";// 14-07-2022
		System.out.println(date.replace('/', '-'));
		System.out.println(name.equals(name2));// false
		System.out.println(name.compareTo(date));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.toUpperCase());
		System.out.println(name3.toLowerCase());

		System.out.println(name3.contains("ZZ"));

		int i = 100;
		int j = 200;
		System.out.println(i + j);
		System.out.println(i + j + name);// 300 swhizz institute
		System.out.println(name + i + j);// swhizz institute 100200

		System.out.println(name.concat(date));

		// split method will the values baaed on our required splitting part,after
		// splitting it will store the output in array format
	String	a[]=name.split(" ");
	System.out.println(a.length);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
