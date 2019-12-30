
import java.util.Scanner;

public class Homework_01Lec_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me number:");

		int number = scan.nextInt();
		int topNum;

		while (number != -1) {

			System.out.println("Give me more number:");
			number = scan.nextInt();

		}
		if (number == -1) {

			System.out.println("The top number is:");

			scan.close();
		}
		// + top
	}
	
}
