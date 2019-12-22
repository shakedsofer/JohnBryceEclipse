
import java.util.Scanner;

public class Questions2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Choose Number:");
		
		float width; // רוחב
		float height; // גובה או אורך

		width = s.nextInt();
		height = s.nextInt();

		float area = ((float) height * width);
		float circumference = ((float) height * 2 + width * 2);

		System.out.println("Area is: " + area + "\nCircumference is: " + circumference);
	}

}