package lecture_03;

import java.util.Scanner;

/* תרגיל: בקשו ממשתמש קלט בין 1 ל 6, המציין סוג משקה במכונת קפה
	וברכו אותו לרוויה באופן הבא:
	עבור ערך 1: קפה שחור
	עבור ערך 1: אספרסו	
	עבור ערך 1: מקיאטו

סוגים 4, 5 , ו 6 אזלו מהמלאי ולכן הדפיסו:
sold out

כל קלט אחר אינו תקין. הדפיסו הודעה מתאימה.

*/

public class Exercise_05InClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Give your coffie choise");
		int coffee = scan.nextInt();

		if (coffee > 6 || coffee < 0) {
			System.out.println("Give me your real choise coffie!!");
		} else if (coffee == 1) {
			System.out.println("Black coffie");
		} else if (coffee == 3) {
			System.out.println("Makiatto");
		} else if (coffee == 2) {
			System.out.println("Aspresso");
		} else {
			System.out.println("Sold out");
		}
	
		scan.close();
	}
}
