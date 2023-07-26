package OOPS;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Jul-2023 5:34:34 pm
 **/
public class D extends B {

	public static void main(String[] args) {
		
		m3();
		
		D obj = new D();
		obj.m4();
		
		m1();
		
		obj.m2();
		
		System.out.println();
		
		// Invoking Parent Class Static Variable in Grand Child's main method
		System.out.println(a);
		
		// Invoking Parent Class Non Static Variable in Child's main method
		System.out.println(obj.b);
		
		System.out.println(a1);
		System.out.println(obj.b1);
		
	}
	
}
