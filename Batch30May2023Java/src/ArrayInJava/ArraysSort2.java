package ArrayInJava;

import java.util.Arrays;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Aug-2023 5:33:58 pm
 **/
public class ArraysSort2 {

	public static void main(String[] args) {

		int arr[] = { 7, 3, 4, 8, 1, 6, 9, 2, 5 };

		Arrays.sort(arr);

		for (int i = arr.length -1 ; i >= 0 ; i--) {

			System.out.println(arr[i]);
		}

	}
}
