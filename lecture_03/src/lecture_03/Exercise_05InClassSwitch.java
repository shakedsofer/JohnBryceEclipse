package lecture_03;

import java.util.Scanner;

public class Exercise_05InClassSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give your coffie choise");
		int coffie = scan.nextInt();

		switch (coffie) {
		case 1:
			System.out.println("Black coffie");
			break;
		case 2:
			System.out.println("Aspresso");
			break;
		case 3:
			System.out.println("Makiatto");
			break;
		case 4:
			System.out.println("Sold out");
			break;
		case 5:
			System.out.println("Sold out");
			break;
		case 6:
			System.out.println("Sold out");
			break;
		default:
			coffie = -1;
			System.out.println("Invalid input");
			break;
		}
		
		scan.close();
	}
}