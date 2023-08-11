package ExceptionsHandlingInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 08-Aug-2023 5:42:42 pm
 **/
public class AssertionInJava {

	public static void main(String[] args) {

		int marks = 15;

		assert marks >= 40 : "Failed";
		
		System.out.println("Pass : " + marks );

	}

}
