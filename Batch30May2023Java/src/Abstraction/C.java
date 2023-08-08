package Abstraction;

/**
 * @Author -- Aditya Shinde Java + Selenium 02-Aug-2023 5:44:16 pm
 **/
public class C extends B {

	@Override
	void checkOut() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		openChrome();

		C obj = new C();

		obj.amazonVisit();
		obj.searchBar();
		obj.searchBar();
		obj.addCart();
		obj.checkOut();

	}

}
