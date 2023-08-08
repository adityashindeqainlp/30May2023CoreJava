package Access1;

/**
 * @Author -- Aditya Shinde Java + Selenium 28-Jul-2023 5:18:07 pm
 **/
public class B1  {

	public static void main(String[] args) {

		//Static 
		System.out.println(A1.a);
		
		A1.m1();
		
		// non static 
		
		A1 obj = new A1();
		System.out.println(obj.b);
		
		obj.m2();
		
	}

}
