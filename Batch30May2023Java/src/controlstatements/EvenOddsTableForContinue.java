package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Jul-2023 8:54:09 am
 **/
public class EvenOddsTableForContinue {

	public static int a;
	public static int b;
	public static int c;

	public void table(int num) {

		System.out.println("Table of : " + num + " With Multiplication ");

		a = num;

		for (int i = 1; i <= 10; i++) {

			b = num * i;

			System.out.print(b + " ");
		}

	}

	public void tableWithoutMultiplication(int num) {

		System.out.println("Table of : " + num + " Without Multiplication ");

		a = num;
		b = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print(b + " ");
			b = a + b;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Odd Numbers");
		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {

				continue;
			}

			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("Even Number");
		for (int i = 0; i <= 100; i++) {

			if (i % 2 != 0) {
				continue;
			}

			System.out.print(i + " ");
		}

		System.out.println();

		EvenOddsTableForContinue obj = new EvenOddsTableForContinue();
		obj.table(3);

		System.out.println();

		obj.tableWithoutMultiplication(2);
	}

}
