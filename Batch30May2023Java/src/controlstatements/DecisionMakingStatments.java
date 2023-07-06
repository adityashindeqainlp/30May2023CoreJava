package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 05-Jul-2023 6:25:09 pm
 **/
public class DecisionMakingStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 40;
		int b = 200;
		int c = 30;

		// Type 1 if Statement
		// True
		if (a < b) {

			System.out.println("A is less than B");

		}

		// Type 2 if-else statement
		if (a > b) {

			System.out.println("A is Greater Than B ");

		} else {

			System.out.println("A is lesser Than B ");
		}
		System.out.println();

		// Type 3 if-else ladder

		if (a > b && a > c) {

			System.out.println("A is Greater Than B And C");
			
		} 
		else if (b > a && b > c) {

			System.out.println("B is Greater Than A And C");
		}
		else {
			
			System.out.println("C is Greater Than A and B ");
		}
		
		//Ternary Operators 
		
		System.out.println();
		
		int l1 = a>b?a:b;
		
	int largest =l1>c?l1:c;

	System.out.println("Larget Value : " + largest);
	
	}

}
