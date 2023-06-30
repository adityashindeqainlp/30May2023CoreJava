package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Jun-2023 6:10:50 pm
 **/
public class P5_CallingStaticInStatic {

	public static void m1() {

		System.out.println("Calling of static method in static method");
	}

	public static void m2() {

		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m2();
	}

}
