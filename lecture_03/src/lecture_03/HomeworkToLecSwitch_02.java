package lecture_03;

public class HomeworkToLecSwitch_02 {

	public static void main(String[] args) {

		Math.random();

		int coin = (int) (Math.random() * 2);

		switch (coin) {
		case 0:
			System.out.println("Heads");
			break;
		default:
			coin = 1;
			System.out.println("Tails");
			break;
		}
	}
}