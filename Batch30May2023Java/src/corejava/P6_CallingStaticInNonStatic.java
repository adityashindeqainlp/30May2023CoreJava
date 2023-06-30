package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Jun-2023 6:20:39 pm
 **/
public class P6_CallingStaticInNonStatic {

	public static void m1() {

		System.out.println("Calling Static method in non static method");
	}

	public void m2() {

		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P6_CallingStaticInNonStatic obj = new P6_CallingStaticInNonStatic();

		obj.m2();
	}

}
