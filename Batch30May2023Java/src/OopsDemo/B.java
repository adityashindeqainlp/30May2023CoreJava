package OopsDemo;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jul-2023 5:21:00 pm
 **/
public class B extends A {

	public static int a = 100;
	public int b = 200;

	public static void m1() {

		int a = 1;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		// Calling Global Static Var //ClassName.VaraibleName
		System.out.println(B.a);
		
		//Calling Parent Global Static Var.//ClassName.VaraibleName
		System.out.println(A.a);

		// Calling Global Non Static Var.
		B obj = new B();
		System.out.println(obj.b);
		
		//Calling Parent Global Non Static Var.
		A ref = new B();
		System.out.println(ref.b);
	}

	
	public void m2() {
		
		int a = 1;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		//Calling of static var //ClassName.VaraibleName
		System.out.println(B.a);
		
		//Calling of static var //ClassName.VaraibleName
		System.out.println(A.a);
		
		//Calling of non static var // this.varaiableName
		System.out.println(this.b);
		
		//Calling of non static var // super.varaiableName
		System.out.println(super.b);
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling of static method in main method
		m1();

		System.out.println();
		
		// Calling of non static method in main method
		B obj = new B();
		obj.m2();
	}

}
