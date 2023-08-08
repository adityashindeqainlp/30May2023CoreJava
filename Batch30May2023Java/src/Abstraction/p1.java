package Abstraction;
/**
*@Author -- Aditya Shinde Java + Selenium 
* 03-Aug-2023
* 4:51:19 pm
**/
public class p1 {

	public final static int a = 100;
	
	public final int b = 2000;
	
	
	
	
	
	public static void main(String[] args) {
		
		//Re assignment to static 
		
		System.out.println(a);
		
		//Re assignment to non static 
		
		p1 obj = new p1();
		
		System.out.println(obj.b);
		
		
		
		
	}
}
