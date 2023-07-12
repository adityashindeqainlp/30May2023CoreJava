package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Jul-2023 5:58:15 pm
 **/
public class JumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Statement Break;

		for (int i = 0; i <= 10; i++) {

			System.out.println(i);

			if (i == 5) {
				break;
			}
		}

		System.out.println();

		int a = 0;

		while (a <= 10) {

			System.out.println(a);

			if (a == 3) {

				break;
			}

			a++;

		}

		System.out.println();

		// Continue

		for (int i = 0; i <= 10; i++) {

			if (i == 6) {

				continue;
			}

			System.out.println(i);
		}

		System.out.println();

		int i = 0; //5

		while (i <= 10) {

			if (i == 4) {

				i++; //5
				continue;
			}

			System.out.println(i);
			i++;
		}

		

	}

}
