package OOPs;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Jul-2023 5:13:32 pm
 **/
public class C extends A {

	public static void m5() {
		
		System.out.println("Method of Child Class C ");
	}
	
	public void m6() {
		
		System.out.println("Non static method of child class c");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Invoke Static method of parent in Child class
		m1();

		//Invoke Non Static method of parent in Child class
		C obj = new C();
		obj.m2();
	}

}
