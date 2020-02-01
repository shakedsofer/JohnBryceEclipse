package classExercise;

import java.util.Scanner;

public class ArrayExr {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insert number please: ");
		int num = scan.nextInt();

		int[] arry = new int[num];

		int odd = 0;
		int even = 0;

		for (int i = 0; i < arry.length; i++) {
			System.out.println("cell " + i);
			arry[i] = scan.nextInt();

			if (even % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}

		System.out.printf("%d Even \n%d Odd", even, odd);
	}

}
