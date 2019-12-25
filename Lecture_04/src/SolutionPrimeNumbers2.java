import java.util.Scanner;

public class SolutionPrimeNumbers2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dear user, please insert a number: ");
		int number = scanner.nextInt();

		boolean prime = true;
		for (int i = 2; i < number && prime; i++) {
			System.out.println("I'm checking if number % " + i + " == 0");
			if (number % i == 0) {
				System.out.println("I found a divider: " + i);
				prime = false;
			}
		}

		if (prime) {
			System.out.println("The number " + number + " is INDEED prime!");
		} else {
			System.out.println("The number: " + number + " is not prime!");
		}

		scanner.close();

	}

}
