package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 03-Aug-2023 5:03:25 pm
 **/
public class C1 extends B1 implements D1{

	@Override
	public void searchPage() {

		System.out.println("Serach Page");

	}

	@Override
	public void aboutUs() {

		System.out.println("About us page");

	}
	
	@Override
	public void shoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ps5() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Composition
		A1.openChrome();

		C1 obj = new C1();

		obj.amazonUrl();
		obj.homePage();
		obj.createAccountPage();
		obj.loginPage();
		obj.searchPage();
		obj.aboutUs();
		
		System.out.println(A1.price);
		
		//Non static Global Var From Interface
		System.out.println(A1.discount);
		//System.out.println(obj.discount); not as per rules 

	}



}
