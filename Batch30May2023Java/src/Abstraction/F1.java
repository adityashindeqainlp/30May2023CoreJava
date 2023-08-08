package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 03-Aug-2023 5:28:05 pm
 **/
public class F1 implements A1, D1, E1 {

	@Override
	public void homeAppliances() {
		// TODO Auto-generated method stub
		
		System.out.println("home Appliances");
		
	}

	@Override
	public void kidsToys() {
		// TODO Auto-generated method stub
		
		System.out.println("kids Toys");
	}

	@Override
	public void fashion() {
		// TODO Auto-generated method stub
		System.out.println("Fashion");
	}

	@Override
	public void amzaonPrime() {
		// TODO Auto-generated method stub
		System.out.println("amzaonPrime");
	}

	@Override
	public void amazonPay() {
		// TODO Auto-generated method stub
		
		System.out.println("amazonPay");
	}

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub
		
		System.out.println("addToCart");
	}

	@Override
	public void orderPage() {
		// TODO Auto-generated method stub
	
		System.out.println("orderPage");
	}

	@Override
	public void shoes() {
		// TODO Auto-generated method stub
		
		System.out.println("shoes");
	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		
		System.out.println("dress");
	}

	@Override
	public void ps5() {
		// TODO Auto-generated method stub
		System.out.println("PS5");
	}

	@Override
	public void homePage() {
		// TODO Auto-generated method stub
	System.out.println("homePage");
		
	}

	@Override
	public void loginPage() {
		// TODO Auto-generated method stub
		
		System.out.println("loginPage");
	}

	@Override
	public void createAccountPage() {
		// TODO Auto-generated method stub
		
		System.out.println("createAccountPage");
	}

	@Override
	public void searchPage() {
		// TODO Auto-generated method stub
		
		System.out.println("searchPage");
	}

	@Override
	public void aboutUs() {
		// TODO Auto-generated method stub
		
		System.out.println("aboutUs");
	}
	
	
	
	public static void main(String[] args) {
		
		
		F1 obj = new F1();
		
		obj.aboutUs();
		
		obj.ps5();
		
		obj.addToCart();
		
		
		
	}

}
