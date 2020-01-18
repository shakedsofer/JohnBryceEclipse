import java.util.Scanner;

public class Employee {

	public String name;
	public double age;
	public double height;
	public double salary;

	public static void main(String[] args) {

		Scanner person = new Scanner(System.in);
		Person newperson = new Person();

		System.out.println("Give me your name");

		String yourName = person.nextLine();

		System.out.println("Give me your age");

		double yourAge = person.nextDouble();

		System.out.println("Give me your height");

		double yourHeight = person.nextDouble();

		System.out.println("Give me your salary");

		double yourSalary = person.nextDouble();

		person.close();

		System.out.println("Your name is: " + yourName + 
				"\nyour age is:" + yourAge + 
				"\nyour height is : " + yourHeight +
				"\nyou are:");

		if (yourSalary >= 50_000) {

			System.out.print("Rich");

		} else if (yourSalary >= 20_000) {

			System.out.print("Well paid");

		} else if ( yourSalary >= 0) {

			System.out.print("Poor");

		} else {
			System.out.print("Error");

		}

	}
}
