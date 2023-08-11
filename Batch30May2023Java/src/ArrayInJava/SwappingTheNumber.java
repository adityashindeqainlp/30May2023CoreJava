package ArrayInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Aug-2023 5:07:27 pm
 **/
public class SwappingTheNumber {

	public static void main(String[] args) {

		int a = 10,  // a = 20
		    b = 20,  // b = 10
		    temp = 0;
		
		temp = a; //temp = 10 a = 0
		a = b;    // a = 20    b=0 
		b = temp; // b = 10    temp =0
		
		System.out.println(a);

		System.out.println(b);
	}

}
