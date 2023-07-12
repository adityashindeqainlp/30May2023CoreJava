package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Jul-2023 5:23:38 pm
 **/
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1; // Initialization

		while (a < 10) { // Condition

			System.out.println(a);

			a++; // Update
		}

		System.out.println();

		// For Loop for(Initialize ; Condition ; Update)
		for (int i = 1; i < 10; i++) {

			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {

			System.out.println("Iteration : " + i);

		}

		System.out.println("End Of For Loop");

	}

}
