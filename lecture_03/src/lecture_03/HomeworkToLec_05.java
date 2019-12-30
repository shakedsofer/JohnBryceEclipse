package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me your salary:");

		int salary = scan.nextInt();

		if (salary <= 0) {
			
			salary = scan.nextInt();

		} else if (salary <= 23000) {
			double toPee = salary * 0.1;
			double salaryAfterDeduction = salary - toPee;
			System.out.println(+salaryAfterDeduction);

		} else if (salary >= 23_000 && salary <= 50_000) {
			double toPee = salary * 0.2;
			double salaryAfterDeduction = salary - toPee;
			System.out.println(+salaryAfterDeduction);

		} else if (salary >= 50_000 && salary <= 100_000) {
			double toPee = salary * 0.3;
			double salaryAfterDeduction = salary - toPee;
			System.out.println(+salaryAfterDeduction);
		} else {
			double toPee = salary * 0.4;
			double salaryAfterDeduction = salary - toPee;
			System.out.println(+salaryAfterDeduction);
	
			scan.close();
		}
	}
}
