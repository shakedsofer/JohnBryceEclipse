
import java.util.Scanner;

public class Questions0New {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		float height = s.nextFloat();
		float width = s.nextFloat();

		int area = (int) (height * width);
		int circumference = (int) (height * 2 + width * 2);

		System.out.println("Area is: " + area + " Circumference is: " + circumference);
	}

}