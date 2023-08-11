package ArrayInJava;

import java.util.Arrays;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Aug-2023 5:48:56 pm
 **/
public class CompareAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,3,4};
		int [] b = {2,3,4,7};
		int [] c = {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, a));
		
	}

}
