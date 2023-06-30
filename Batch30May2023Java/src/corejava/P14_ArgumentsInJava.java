package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 29-Jun-2023 5:54:48 pm
 **/
public class P14_ArgumentsInJava {

	/*
	 * Type 1 No Argument No Return Type / No Return No Signature Type
	 */

	public static void m1() {

		System.out.println("No Argument No Return Type");

	}

	/*
	 * Type 2 With Return No Argument / With return no Signature
	 */

	public static int m2() {

		return 12;
	}

	/*
	 * Type 3 With Return With Argument / With Return with signature
	 */

	public static int m3(int a, int b) {

		int c = a + b;

		return c;
	}

	/*
	 * Type 4 No Return With Argument / No Return With Signature
	 * 
	 */

	public static void m4(int a) {

		System.out.println("No Return With Argument");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();

		System.out.println(m2());

		System.out.println(m3(10, 20));

		m4(10);

	}

}
