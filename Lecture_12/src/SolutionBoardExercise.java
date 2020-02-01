import java.util.Arrays;
import java.util.Scanner;

public class SolutionBoardExercise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dear user, please select a size for the array:");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please insert a value to cell #" + i);
			arr[i] = scanner.nextInt();
		}

		// Counts the amount of even numbers.
		int even = 0;
		// Counts the amount of odd numbers.
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];

			if (value % 2 == 0) {
				// count even.
				even++;
			} else {
				// count odd.
			}
		}

		System.out.printf("There are %d even values, and %d odd values.", even, odd);

		scanner.close();

	}

}
