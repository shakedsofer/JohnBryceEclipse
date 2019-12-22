
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("User please give day 1-7:");

		final int a = s.nextInt();

		if (a >= 6 ) {
			System.out.println(a + " Its weekend");

		if (a < 6) {
			System.out.println(a + " Its normal day");
		 }	
		 
		if (a > 7 || a < 1) {
			System.out.println("bye!");
			}

		}
	}
}