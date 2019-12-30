package lecture_03;

import java.util.Scanner;


public class HomeworkToLecSwitch_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Give month and year: ");

		int month = scan.nextInt();
		int year = scan.nextInt();

		scan.close();
		if (month <= 12 && month >= 1 && year >= 0) {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("In year " + year + " and at month " + month + " have 31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days");
				break;

			case 2:
				if ((year % 4 == 0) && (year % 400 != 0) || (year % 100 == 0)) {
					System.out.println("29 days");

				} else {
					System.out.println("28 days");
				}
				break;

			default:
				month = 0;
				year = -1;
				System.out.println("Abnormal");
				break;
			}
		}
		else {
			System.out.println("Abnormal");
		}
	}
}