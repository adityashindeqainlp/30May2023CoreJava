package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jun-2023 6:56:38 pm
 **/
public class P11_CallingOfGlobalVarInNonStaticMethod {

	public static int a = 100;
	public int b = 200;
	
	public void m1() {
		
		//Calling global static var in non stat method 
		System.out.println(a);
		
		//Calling global non static var in non static method
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//Calling Non static method in main method
		P11_CallingOfGlobalVarInNonStaticMethod obj = new P11_CallingOfGlobalVarInNonStaticMethod();
		obj.m1();
		
	}

}
