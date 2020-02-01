import java.util.Random;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {

		String[] colors = { "B", "Y", "R", "G", "O" };

		int rColors = (int) Math.random() * colors.length;
		System.out.println(+rColors);
		System.out.print("choice colors: ");

		for (int i = 0; i < colors.length; i++) {
			System.out.print(colors[i] + " ");
		}

		double numChoices = 2;
		Scanner choice = new Scanner(System.in);
		String newChoice = choice.nextLine();

		for (int i = 0; numChoices > i; i++)

			if (newChoice == colors[rColors]) {

				System.out.println("Please insert more color");
				System.out.println("X");
				newChoice = choice.nextLine();

				// }else if {

			} else {

				System.out.println("Please insert more color");
				System.out.println("_");
				newChoice = choice.nextLine();

			}
	}

//		

//		java.util.Scanner scan = new java.util.Scanner(System.in);
//		System.out.println("Please enter char");
//		String color = scanner.next().charAt(0);
//
}

//				if (i == 3) {
//
//					return;
//				} else {
//					break;
//		String[] randomColor = pickRandom(colors, 3);