import java.util.Scanner;

public class DoWhileStatementExamplePositiveInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;

		do {
			System.out.println("Please insert a number: ");
			number = scanner.nextInt();
		} while (number <= 0);

		System.out.println("Thank you for the positive number: " + number);

		scanner.close();

	}

}
