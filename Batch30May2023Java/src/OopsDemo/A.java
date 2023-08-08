package OopsDemo;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jul-2023 5:20:39 pm
 **/
public class A {

	public static int a = 1000;
	public int b = 2000;

	public static void m1() {

		System.out.println("I am a static method from A");
	}

	public void m2() {

		System.out.println("I am a Non static Method From A");

	}

	
	public static void main(String[] args) {
		
		// Composition
		//Child Static Method In parent's Main 
		//ClassName.methodName
		C.m3();
		
		//Child Non Static Method In Parent's Main
		//Child Class Reference With Child Class Object
		C ref = new C();
		ref.m4();

	}

}
