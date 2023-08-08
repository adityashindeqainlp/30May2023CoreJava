package OOPS;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Jul-2023 5:34:34 pm
 **/
public class D extends B {
	
	public static int a =100;
	public int b = 200;

	public static void main(String[] args) {
		
		m3();
		
		D obj = new D();
		obj.m4();
		
		m1();
		
		obj.m2();
		
		System.out.println();
		
		// Invoking Parent Class Static Variable inChild's main method
		System.out.println(a);
		
		// Invoking Parent Class Non Static Variable in Child's main method
		System.out.println(obj.b);
		
		
		// Invoking Parent(Super)Class Static Variable in Grand Child's main method
	    // Classname.GlobalVariableName
		System.out.println(A.a);
		
		// Invoking Parent(Super)Class Non Static Variable in Grand Child's main method
		// Parent class reference with grand Child class object 
		A ref = new D();
		System.out.println(ref.b);
	}
	
}
