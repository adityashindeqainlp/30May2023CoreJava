package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Jul-2023 6:13:00 pm
 **/
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0; // 1

		while (a <= 10) {

			System.out.println("While Loop " + a);

			a++;

		}

		System.out.println("End Of the While Loop");
		
		System.out.println();

		int number = 2;
		int multiple = 1;

		while (multiple <= 10) {

			int c = number * multiple;
			System.out.print(c + " ");

			multiple++;

		}

	}
}