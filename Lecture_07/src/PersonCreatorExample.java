import java.util.Scanner;

public class PersonCreatorExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dear user, what is your name: ");

		String selectedName = scanner.nextLine();

		System.out.println("What is your age?");

		double selectedAge = scanner.nextDouble();

		System.out.println("What is your weight?");

		double selectedWeightKg = scanner.nextDouble();

		Person myPerson = new Person();

		System.out.println("Hi, my name is " + myPerson.name + " I'm " + myPerson.age + " years old, and my weight is "
				+ myPerson.weightKg + " KG");

		scanner.close();
	}
}
