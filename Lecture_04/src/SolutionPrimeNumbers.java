import java.util.Scanner;

public class SolutionPrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dear user, please insert a number: ");
		int number = scanner.nextInt();

		int i;
		for (i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				System.out.println("The number: " + number + " is not prime!");
				break;
			}
		}

		if (i == number) {
			System.out.println("The number " + number + " is indeed prime!");
		}

		scanner.close();

	}

}
