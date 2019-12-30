package lecture_03;

import java.util.Scanner;

public class HomeworkToLecSwitch_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Give me temperature");
		int temp = scan.nextInt();
		System.out.println("Give me number");
		int num = scan.nextInt();
		scan.close();

		if (num == 1 || num == 0) {

			switch (num) {
		
			case 0:
				 double Celsius = (temp - 32) / 1.8;
				System.out.println("Temperature in Celsius: " + Celsius);
				break;

			default:
				double fahrenheit = (temp * 1.8) + 32;
				System.out.println("Temperature in fahrenheit: " + fahrenheit);
				break;
			}
		} else {
			System.out.println("Error");

		}
	}
}





