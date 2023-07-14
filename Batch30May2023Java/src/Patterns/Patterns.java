package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 4:51:43 pm
 **/
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * **** **** **** ****
		 */

//		System.out.println("****");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		int rows = 4;
		int cells = 4;

		outerloop: for (int i = 1; i <= rows; i++) {

			innerloop: for (int j = 1; j <= cells; j++) {

				if (i == 1 || j == 1 || i == rows || j == cells) {

					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
