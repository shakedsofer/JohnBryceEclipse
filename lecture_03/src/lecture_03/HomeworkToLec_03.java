package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give number:");

		int num = scan.nextInt();

		scan.close();

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
			// ____________________________ Challenge

		double x = ((double) num / 2);

		System.out.println(x);
	}

}