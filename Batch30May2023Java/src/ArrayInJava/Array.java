package ArrayInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 09-Aug-2023 5:03:13 pm
 **/
public class Array {

	public static void main(String[] args) {

		int a = 1, b = 2, c = 3, d = 4, e = 5;

		// Traditional Method To define Array
		int[] ar = new int[6];
		ar[0] = 1;
		ar[1] = 2;
		ar[2] = 3;
		ar[3] = 4;
		ar[4] = 5;
		ar[5] = 6;

		int len = ar.length;
		System.out.println("Length of an Array " + len);

		// size = length - 1; //Index values

		// Print of the array in forward manner
		for (int i = 0; i < ar.length; i++) {

			System.out.println(" Size " + i + " data " + ar[i]);
		}

		System.out.println();

		// Print of the array in reverse manner

		for (int i = ar.length - 1; i >= 0; i--) {

			System.out.println(" Size " + i + " data " + ar[i]);
		}

		// For Each // Only used to extract an elements for an array

		for (int a1 : ar) {

			System.out.println(a1);

		}

	}
}
