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
		int coffie = scan.nextInt();

		if (coffie > 6 || coffie < 0) {
			System.out.println("Give me your real choise coffie!!");
		
			
		} else if (coffie  > 1 ) {
			System.out.println("Black coffie");
		} else if (coffie == 3 ) {
			System.out.println("Makiatto");
		} else if (coffie == 2 ) {
			System.out.println("Aspresso");
		} else {
			System.out.println("Sold out");
		}
		scan.close();	
	}
}


