package ExceptionsHandlingInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 08-Aug-2023 5:35:30 pm
 **/
public class StackOverFlowError {

	public void m1() {

		System.out.println("Calling non static method in non static method");
		m2();

	}

	public void m2() {

		System.out.println("Calling non static method in non static method");
		m1();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackOverFlowError obj = new StackOverFlowError();
		obj.m1();
	}

}
