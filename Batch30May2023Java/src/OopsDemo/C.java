package OopsDemo;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jul-2023 5:21:11 pm
 **/
public class C {

	public static void m3() {

		System.out.println("I am a Static Method From C");
	}

	public void m4() {
		
		System.out.println("I am a Non Static Method From C");
	}
	
	public static void main(String[] args) {

		//Composition 
		//Parent Static Method In Child's Main 
		//ClassName.methodName
		A.m1();
		
		//Parent Non Static Method In Child's Main
		//Parent Class Reference With Parent Class Object
		A ref = new A();
		ref.m2();
	
	}

}
