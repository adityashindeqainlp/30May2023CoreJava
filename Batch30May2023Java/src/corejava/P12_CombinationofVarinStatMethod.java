package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 29-Jun-2023 5:21:27 pm
 **/
public class P12_CombinationofVarinStatMethod {

	public static int a = 100;
	public int b = 200;

	public static void m1() {

		int a = 1;
		int b = 2;

		// Calling of the local variable
		System.out.println(a);
		

		// calling of the global static variable (ClassName.VariableName)
		System.out.println(P12_CombinationofVarinStatMethod.a);

		// Calling of the local variable
		System.out.println(b);
		
		// Calling of the global non static variable
		P12_CombinationofVarinStatMethod obj = new P12_CombinationofVarinStatMethod();
		System.out.println(obj.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();

	}

}
