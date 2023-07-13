package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Jul-2023 5:36:16 pm
 **/
public class SwitchCaseStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 45;

		if (num == 10) {

			System.out.println("Number is 10");
		} else if (num == 20) {

			System.out.println("Number is 20");
		} else if (num == 30) {

			System.out.println("Number is 30");
		} else {

			System.out.println("Different Number");
		}

		switch (num) {

		case 10:
			System.out.println("Number is 10 ");
		case 20:
			System.out.println("Number is 20 ");
		case 30:
			System.out.println("Number is 30 ");
		default:
			System.out.println("Different Number");

		}

	}

}
