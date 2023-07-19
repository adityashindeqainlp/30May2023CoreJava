package OOPs;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Jul-2023 4:42:06 pm
 **/
public class A  {

	public static int a = 10;
	public int b = 20;

	public static void m1() {

		System.out.println("Static method of Parent Class");

	}

	public void m2() {

		System.out.println("Non static method of parent class");

	}

	public A() {

		System.out.println("Constructor of parent Class ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);

		A obj = new A();
		System.out.println(obj.b);

		m1();

		obj.m2();

	}

}
