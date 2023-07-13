package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 12-Jul-2023 6:06:49 pm
 **/
public class P18_ConstructorInJava {

	public P18_ConstructorInJava() {

		System.out.println("Non Parameterized Constructor");

	}

	public P18_ConstructorInJava(int a) {

		this();
		System.out.println("Parameterized Constructor -- 1");

	}

	public P18_ConstructorInJava(int b, int c) {

		this(30);
		System.out.println("Parameterized Constructor -- 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Invoking the constructor in main method
//		new P18_ConstructorInJava();
//
//		// Invoking the Parameterized constructor in main method
//		new P18_ConstructorInJava(10);

		// Constructor Chaining
		new P18_ConstructorInJava(10, 20);

	}

}
