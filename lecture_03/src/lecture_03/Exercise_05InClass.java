package lecture_03;

import java.util.Scanner;

/* �����: ���� ������ ��� ��� 1 � 6, ������ ��� ���� ������ ���
	����� ���� ������ ����� ���:
	���� ��� 1: ��� ����
	���� ��� 1: ������	
	���� ��� 1: ������

����� 4, 5 , � 6 ���� ������ ���� ������:
sold out

�� ��� ��� ���� ����. ������ ����� ������.

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
