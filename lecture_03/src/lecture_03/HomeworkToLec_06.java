package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me number year:");

		int numYear = scan.nextInt();

		// Help to if year is a leap year or not leap year
		// https://docs.microsoft.com/he-il/office/troubleshoot/excel/determine-a-leap-year

		scan.close();

		if (numYear <= 0) {
			System.out.println(numYear + " invalid year");

		} else if ((numYear % 4 == 0) && (numYear % 400 != 0) || (numYear % 100 == 0)) {

			// if you check to leap year you need if the year divided to 4 and not have	remainder
			// and .. check the year if the year divided to 400 and year not worthless 0

			// Or year divided to 100 and not have remainder

			System.out.println(numYear + " Leap");
		} else {
			System.out.println(numYear + " Not leap");
		}
	}
}