package lecture_03;

import java.util.Scanner;

public class Exercise_04InClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me your number grade");

		int x = scan.nextInt();

		scan.close();

		if (x > 100 || x < 0) {
			System.out.println("Give me your real number grade!!");

		} else if (x > 89) {
			System.out.println("Excellent");
		} else if (x < 91 && x > 69) {
			System.out.println("Very good");
		} else if (x <= 69 && x >= 60) {
			System.out.println("Good");
		} else {
			System.out.println("Fail");
		}

	}

}
