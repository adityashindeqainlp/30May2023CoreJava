package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jun-2023 6:06:43 pm
 **/
public class P9_GlobalStaticVariable {

	public static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling Static Variable in main method
		System.out.println(a);

		// Assign new value to global static variable
		a = 200;

		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);

		a = 300;
		System.out.println(a);

	}

}
