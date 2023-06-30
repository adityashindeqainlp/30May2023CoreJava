package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jun-2023 6:48:12 pm
 **/
public class P10_CallingOfGlobalVarInStaticMethod {

	public static int a = 100;
	public int b = 200;

	public static void m1() {

		// Calling of global Static Variable in static method
		System.out.println(a);

		// Calling of global non Static Variable in static method
		P10_CallingOfGlobalVarInStaticMethod obj = new P10_CallingOfGlobalVarInStaticMethod();
		System.out.println(obj.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calling Static method in main method 
		m1();
		
	}

}
