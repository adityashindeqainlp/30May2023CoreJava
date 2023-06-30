package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 23-Jun-2023 6:34:10 pm
 **/
public class P7_CallingNonStaticInStatic {
	
	public void m1() {
		
		System.out.println("Calling Non static method in static method");
	}
	
	public static void m2() {
		
		P7_CallingNonStaticInStatic obj = new P7_CallingNonStaticInStatic();
		obj.m1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m2();

	}

}
