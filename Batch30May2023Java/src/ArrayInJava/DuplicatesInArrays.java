package ArrayInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Aug-2023 5:41:18 pm
 **/
public class DuplicatesInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = { 1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9 };

		outerloop: for (int i = 0; i < ar.length; i++) {

			innerloop: for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] == ar[j]) {

					System.out.println(ar[j]);
				}

			}

		}
	}

}
