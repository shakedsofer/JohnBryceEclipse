package lecture_03;

import java.util.Scanner;

public class HomeworkToLec_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me your salary:");

		int salary = scan.nextInt();

		scan.close();

		if (salary <= 23000) {

			double toPee = salary / 10;
			double salaryAfterDeduction = salary - toPee;
			System.out.println(+salaryAfterDeduction);

			/*
			 * if (raisedSalary <= 6000) System.out.println("Your a good employee");
			 * System.out.println("your salary up to:" + raisedSalary);
			 * 
			 * double newSalary = raisedSalary + salary;
			 * System.out.println("your salary now:" + newSalary);
			 * 
			 * } else {
			 * System.out.println("We're sorry, but the provided salary is invalid");
			 */}
	}

}