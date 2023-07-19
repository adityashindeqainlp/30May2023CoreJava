package OOPs;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Jul-2023 5:22:59 pm
 **/
public class D {

	public static void main(String[] args) {
		
		
		/*Composition*/
		
		//Access Static method of B 
		//ClassName.methodName
		B.m3();
		
		//Access Static method of C
		//ClassName.methodName
		C.m5();
		
		//Access Non Static method of B 
		// Parent Class Ref. Var and Parent class Obj 
		B obj = new B();
		obj.m4();

		//Access Non Static method of C 
		// Parent Class Ref. Var and Parent class Obj 	
		
		C obj2 = new C();
		obj2.m6();
		
	}

}
