import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		System.out.println("Write sec movie");

		Scanner second = new Scanner(System.in);

		int sec = ((int) second.nextInt());
		double min = ((double) sec / 60);
		double hours = ((double) min / 60);
		double day = ((double) hours / 24);

		System.out.println("sec: " + sec + "\nmin: " + min + "\nh: " + hours + "\nday: " + day);

	}

}
