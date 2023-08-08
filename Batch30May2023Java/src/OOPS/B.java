package OOPS;

/**
 * @Author -- Aditya Shinde Java + Selenium 24-Jul-2023 4:44:27 pm
 **/
public class B extends A {

	public static int a= 1;
	public int  b= 2;

	public static void m3() {

		System.out.println("I am a static method from B ");
	}

	public void m4() {

		System.out.println("I am a non static method from B");
	}

	
	
	public B(){
		//Invoke Parent Class Parameterized Constructor in Child's Non parameterized con. 
		super(10);
		System.out.println("I am a Non Parameterised Constructor of Class B");
		
	}
	
	public B(int b) {
		
		super(100);
		System.out.println("I am a Parameterised Constructor of Class B");
	}
	
	
	public static void main(String[] args) {

		// Invoke Parent Class Static method in Child's of main
		m1();

		// Invoke Parent Class Non Static method in Child's of main
		B obj = new B();
		obj.m2();

		A obj1 = new B();
		obj1.m2();

		A obj2 = new A();
		obj2.m2();

		System.out.println();

		// Invoking Parent Class Static Variable in Child's main method
		System.out.println(a);

		// Invoking Parent Class Non Static Variable in Child's main method
		System.out.println(obj.b);
		
		
		new B();
		
		new B(21);
		

	}

}
