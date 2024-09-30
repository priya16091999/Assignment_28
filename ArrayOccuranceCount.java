package assignment_28;
import java.util.Scanner;
public class ArrayOccuranceCount {
	


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int count = 0;
			System.out.println("How many Element You want Enter in Array:");
			int n = sc.nextInt();

			int[] A = new int[n];

			System.out.println("Enter " + n + " Elements:");

			for (int i = 0; i < A.length; i++) {

				A[i] = sc.nextInt();
			}

			System.out.println("Enter Number for Occurence");
			int occ = sc.nextInt();

			for (int i = 0; i < A.length; i++) {
				if (A[i] == occ)
					count++;
			}
			System.out.println("Count is " + count);

		}

}
