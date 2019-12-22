import java.util.Scanner;

public class TheFinalKeyword {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Write");

		int radius = scanner.nextInt();

		double area = 3.14 * radius * radius;

		double circumference = 2 * 3.14 * radius;
		System.out.println("The area" + area);
		System.out.println("The cir" + circumference);

		scanner.close();

	}

}
