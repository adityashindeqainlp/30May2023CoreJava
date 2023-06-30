package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 29-Jun-2023 5:40:19 pm
 **/
public class P13_CombinationOfVariableInNonStatMethod {

	public static int a = 100;
	public int b = 200;

	public void m1() {

		int a = 10;
		int b = 20;

		// Calling of the local variable
		System.out.println(a);

		// calling of the global static variable (ClassName.VariableName)
		System.out.println(P13_CombinationOfVariableInNonStatMethod.a);

		// Calling of the local variable
		System.out.println(b);

		// Calling Global non static variable in non static method (this.VariableName)
		System.out.println(this.b);

	}

	public static void main(String[] args) {

		P13_CombinationOfVariableInNonStatMethod obj = new P13_CombinationOfVariableInNonStatMethod();
		obj.m1();

	}

}
