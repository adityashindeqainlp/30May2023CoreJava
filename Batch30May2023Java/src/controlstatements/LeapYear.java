package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Jul-2023 8:45:57 am
 **/
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2023;

		// Step 1 Check given year completely divisible by 4
		// Step 2 Check for Century year it is not divisible 100
		// Step 3 Check for Century year completely divisible by 400

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println("It is a Leap Year");
		} else {
			System.out.println("It is not a leap Year");
		}

	}

}
