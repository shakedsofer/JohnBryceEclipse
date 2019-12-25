package lecture_03;

import java.util.Scanner;

public class Exercise_04InClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me your grade");

		int grade = scan.nextInt();

		scan.close();

		if (grade > 100 || grade < 0) {
			System.out.println("Give me your real number grade!!");

		} else if (grade >= 90) {
			System.out.println("Excellent");
		} else if (grade <= 90 && grade >= 70) {
			System.out.println("Very good");
		} else if (grade <= 70 && grade >= 60) {
			System.out.println("Good");
		} else {
			System.out.println("Fail");
		}

	}

}
