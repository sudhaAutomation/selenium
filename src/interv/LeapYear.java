package interv;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2023;
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}
		if (leap) {
			System.out.println(year + " this is leap year");
		} else {
			System.out.println(year + " this is not leap year");
		}

	}

}
