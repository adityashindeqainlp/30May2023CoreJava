package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 02-Aug-2023 5:20:17 pm
 **/
 abstract class A {

	
	public static void openChrome() {
		
		System.out.println("Open the chrome & serach google");
		
	}
	
	public void amazonVisit() {
		
		System.out.println("Search Amazon and hit url");
	}
	
	
	abstract void searchBar();
	abstract void addCart();
	abstract void checkOut();
}
