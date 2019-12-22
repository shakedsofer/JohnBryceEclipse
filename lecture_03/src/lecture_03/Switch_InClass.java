package lecture_03;

import java.util.Scanner;

public class Switch_InClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("insert base");
		int base = scan.nextInt();

		System.out.println("insert power");
		int power = scan.nextInt();

		int result = base;

		switch (power) {
			case 0:
				result = 1;
				break;
			case 1:
				result = base;
				break;
			case 2:
				result = base * base;
				break;
			case 3:
				result = base * base * base;
				break;
	
			default:
				result = base;
				System.out.println("Invalid input");
				break;
		}

		System.out.println("The result: " + result);

		scan.close();
	}

}
