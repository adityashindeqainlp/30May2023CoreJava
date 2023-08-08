package OopsDemo;

/**
 * @Author -- Aditya Shinde Java + Selenium 28-Jul-2023 4:59:50 pm
 **/
public class D {

	public static void main(String[] args) {

		//Composition 
		
		//Invoking The Static Method From Different Class
		//ClassName.MethodName 
		A.m1();
		C.m3();
		
		//Invoking The Non Static Method From Different Class
		//Same Class Reference With Same Class Object
		A ref = new A();
		ref.m2();
		
		C obj = new C();
		obj.m4();
	}
}
