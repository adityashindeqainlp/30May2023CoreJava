package Access2;

import Access1.A1;

/**
 * @Author -- Aditya Shinde Java + Selenium 28-Jul-2023 5:11:38 pm
 **/
public class A2   {

	public static void main(String[] args) {

		//Static
		
		System.out.println(A1.a);
		
		A1.m1();
		
		//Non static 
		
		A1 obj = new A1();
		
		System.out.println(obj.b);
		
		obj.m2();
		
	}
}
