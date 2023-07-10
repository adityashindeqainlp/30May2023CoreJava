package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Jul-2023 9:12:30 am
 **/
public class WhileLoopProblems {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 100) {

			System.out.print(num + " ");

			num++;
		}

		System.out.println();

		int num1 = 0;

		while (num1 <= 100) {

			if (num1 % 2 == 0) {

				System.out.print(num1 + " ");

			}

			num1++;
		}

		System.out.println();

		int num2 = 0;

		while (num2 <= 100) {

			if (num2 % 2 != 0) {
				System.out.print(num2 + " ");
			}

			num2++;
		}

	}

}
