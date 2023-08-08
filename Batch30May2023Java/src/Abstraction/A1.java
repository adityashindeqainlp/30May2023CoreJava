package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 03-Aug-2023 4:37:43 pm
 **/
public interface A1 {
	
	public final static int price = 1000;
	public final static int discount = 10;
	
	 void homePage();
	 void loginPage();
	 void createAccountPage();
	 void searchPage();
	 void aboutUs();

	public static void openChrome() {
		
		System.out.println("Visit the chrome and hit amazon url");
	}
	 
	default void amazonUrl() {
		
		System.out.println("https://www.amazon.com");
	}
	
	 
}
