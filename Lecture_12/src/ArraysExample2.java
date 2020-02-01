
public class ArraysExample2 {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 7, 8, 2, 67, -5, -9 };

		System.out.printf("There are %d values in the array.\n", arr.length);

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("]");

	}

}
