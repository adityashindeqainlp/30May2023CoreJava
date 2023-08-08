package Encapsulation;

/**
 * @Author -- Aditya Shinde Java + Selenium 04-Aug-2023 5:15:09 pm
 **/
public class parent {

	
	private parent() {
		
		
		System.out.println("Private constructor of Parent Class");
	}
	
	
	public static void accessConstructor() {
		
		new parent();
	}
	
	
}
