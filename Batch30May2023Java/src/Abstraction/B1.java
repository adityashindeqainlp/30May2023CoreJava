package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 03-Aug-2023 4:57:39 pm
 **/
public abstract class B1 implements A1{

	@Override
	public void homePage() {
		System.out.println("Home Page");
		
	}

	@Override
	public void loginPage() {
		
		System.out.println("Login Page");
		
	}

	@Override
	public void createAccountPage() {
		
		System.out.println("Create Account Page");
	}

	
	
	public abstract void searchPage();

	
	public abstract void aboutUs(); 
	
	

}
