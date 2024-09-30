package assignment_28;
import java.util.Scanner;
import java.util.Arrays;

public class RotationArrayLeftToRight {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the size of the array: ");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter " + n + " elements:");
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			rotateLeft(arr);
			System.out.println("Array after left rotation: ");
			printArray(arr);
			rotateRight(arr);
			System.out.println("Array after right rotation: ");
			printArray(arr);

			scanner.close();
		}

		private static void rotateLeft(int[] arr) {
			if (arr.length == 0)
				return;

			int first = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = first;
		}

		private static void rotateRight(int[] arr) {
			if (arr.length == 0)
				return;

			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		}

		private static void printArray(int[] arr) {
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
}
