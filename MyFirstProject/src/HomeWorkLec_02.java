import java.util.Scanner;

public class HomeWorkLec_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me double digit"); // ãå ñéôøúé

		int num = scan.nextInt();

		scan.close();

		double num02;
		double num03;
		num02 = num / 10;

		num03 = num % 10;

		if (num03 == (int) num02) {

			System.out.println("Equal");

		} else if (num > 9 && num < 100) {

			System.out.println("Not equal");

		} else {
		System.out.println("Invalid");

		}
	}

}