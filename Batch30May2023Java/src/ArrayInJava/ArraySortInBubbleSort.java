package ArrayInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Aug-2023 4:51:39 pm
 **/
public class ArraySortInBubbleSort {

	public static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 7, 3, 4, 8, 1, 6, 9, 2, 5 }; // 3 , 4 , 7 , 1

		int len = arr.length;
		System.out.println(len);

		System.out.println();

		outerLoop: for (int i = 0; i < arr.length; i++) {

			innerLoop: for (int j = i + 1; j < arr.length; j++)

				if (arr[i] > arr[j]) { // ascending is always right
					
					temp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = temp;

				}

			System.out.println(arr[i]);
		}

	}

}
