package OOPs;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Jul-2023 4:59:18 pm
 **/
public class B extends A {
	
	
	public static void m3() {
		
		System.out.println("Static Method Of Child Class B");
	}

	public void m4() {
		
		System.out.println("Non static method of child class b");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoke static method of parent class in child class
		m1();

		// Invoke Non static method of parent class in child class
		//Child Reference With Child Object 
		B obj = new B();
		obj.m2();
		
	    // Invoke Non static method of parent class in child class
		//Parent Reference and  Child Object 
		A obj1 = new B();
		obj1.m2();
		
		//Invalid Case // Invoke Non static method of parent class in child class
		//Child Reference and Parent Object
		
		//B ojb2 = new A();
		
		
	}

}
