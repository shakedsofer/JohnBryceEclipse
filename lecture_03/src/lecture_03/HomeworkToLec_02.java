package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give number:");

		int num = scan.nextInt();

		scan.close();

		if (num >= 0 && num <= 50) {
			System.out.println("Number is in the correct range");
		} else {
			System.out.println("Invalid number");
		}
	}

}