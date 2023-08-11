package ExceptionsHandlingInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 08-Aug-2023 4:40:10 pm
 **/
public class CustomizedExceptionsInJava {

	public int age;

	public void ageValidation(int age) {

		this.age = age;
		if (age > 18) {

			System.out.println("Allowed for Driving & Form  Accept");

		} else {

			try {
				throw new ArithmeticException("Not Allowed for Driving & Form  Reject");

			} catch (ArithmeticException obj) {

				System.out.println("Allowed for driving");
			}
			
		}

	}

	public static void main(String[] args) {

		System.out.println("Visit Govornment Site ");
		System.out.println("Fillig the form");

		CustomizedExceptionsInJava obj = new CustomizedExceptionsInJava();
		obj.ageValidation(15);

		System.out.println("Appointment Id");

	}

}
