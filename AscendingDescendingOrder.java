package assignment_28;

import java.util.Scanner;
import java.util.Arrays;

public class AscendingDescendingOrder {

	public static void main(String[] args) {

		int[] arr = { 1, 90, 34, 89, 7, 9 };

		System.out.println("Original array: " + Arrays.toString(arr));

		int n = arr.length;
		int mid = n / 2;

		Arrays.sort(arr);

		for (int i = mid; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Array after sorting: " + Arrays.toString(arr));
	}
}
