package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Jun-2023 6:42:16 pm
 **/
public class P8_CallingNonStaticInNonStatic {

	public void m1() {

		System.out.println("Calling non static in non static Method ");
	}

	public void m2() {

		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P8_CallingNonStaticInNonStatic obj = new P8_CallingNonStaticInNonStatic();
		obj.m2();
		
	}

}
