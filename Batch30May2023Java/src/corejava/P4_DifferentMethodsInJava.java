package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Jun-2023 5:18:28 pm
 **/
public class P4_DifferentMethodsInJava {

	public static void method1() {

		System.out.println("This is a static method");
	}

	public void method2() {

		System.out.println("This is a non static method ");
	}

	public static void main(String[] args) {

		// Calling of Static Method in Main Method
		method1();

		// Calling of non static method in main method
		P4_DifferentMethodsInJava obj = new P4_DifferentMethodsInJava();
		obj.method2();

		// Not Recommended
		obj.method1();
	}

}
