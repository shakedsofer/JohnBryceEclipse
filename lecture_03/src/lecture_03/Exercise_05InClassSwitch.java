package lecture_03;

import java.util.Scanner;

public class Exercise_05InClassSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give your coffie choise");
		int coffee = scan.nextInt();
			
		switch (coffee) {
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
		case 5:
		case 6:
			System.out.println("Sold out");
			break;
		default:
			coffee = -1;
			System.out.println("Invalid input");
			break;
		}
		
		scan.close();
	}
}