package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give number");

		int num  = scan.nextInt();

		scan.close();

		if (num > 50) {
			System.out.println("is big");
		} else if (num < 50) {
			System.out.println("is small");
		} else {
			System.out.println("Bingo!");
		}
	}

}
