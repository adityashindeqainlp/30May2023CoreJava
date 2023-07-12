package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Jul-2023 5:45:59 pm
 **/
public class ForLoopProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 0-100 numbers in console */

		for (int i = 0; i <= 100; i++) {

			System.out.print(i + " ");
		}

		System.out.println();

		/* 0-100 Even Numbers in console */

		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.print(i + " ");
			}
		}

		System.out.println();

		/* 0-100 Odd Numbers In console */

		for (int i = 0; i <= 100; i++) {

			if (i % 2 != 0) {

				System.out.print(i + " ");
			}
		}

	}

}
