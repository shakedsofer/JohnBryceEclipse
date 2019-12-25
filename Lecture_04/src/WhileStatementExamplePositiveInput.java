import java.util.Scanner;

public class WhileStatementExamplePositiveInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert a number: ");
		int number = scanner.nextInt();

		while (number <= 0) {
			System.out.println("Please insert a number: ");
			number = scanner.nextInt();
		}

		System.out.println("Thank you for the positive number: " + number);

		scanner.close();

	}

}
