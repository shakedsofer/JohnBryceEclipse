
import java.util.Scanner;

public class NewClassQuestion {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int per;
		float price;

		per = s.nextInt();
		price = s.nextInt();		

		float  newPrice = ((float ) per / 100) * price;

		System.out.println(newPrice);
	}

}
