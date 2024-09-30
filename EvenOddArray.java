package assignment_28;
import java.util.Scanner;
import java.util.Arrays;

public class EvenOddArray {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int countodd = 0;
			int counteven = 0;
			System.out.println("Enter the Arrays Size= ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter " + n + " Element");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if ((arr[i] % 2) == 0)
					counteven++;
				else
					countodd++;
			}
			System.out.println("Even Elements count =" + counteven);
			System.out.println("odd Elements count =" + countodd);

		}

}
