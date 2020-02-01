import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert the size of the array: ");
		int size = scanner.nextInt();

		double[] inputs = new double[size];
		
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Please insert a value to the cell #" + i);
			inputs[i] = scanner.nextDouble();
		}
		
		System.out.println(Arrays.toString(inputs));

		System.out.print("[");
		for (int i = inputs.length - 1; i >= 0; i--) {
			System.out.print(inputs[i] + ",");
		}
		System.out.print("]");

		scanner.close();

	}

}
