package OOPS;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Jul-2023 5:16:21 pm
 **/
public class C extends A {

	public static void main(String[] args) {

		// Invoking Parent Static Method in Child's Main
		m1();

		// Invoking Parent Non Static Method in Child's Main
		C obj = new C();
		obj.m2();

		System.out.println();
	  
		// Invoking Parent Class Static Variable in Child's main method
		System.out.println(a);
		
		System.out.println(obj.b);
		
		
	}

}
