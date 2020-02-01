
public class ArraysIntro {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 3;
		arr[2] = arr[1] + arr[0];

		System.out.println("The element in the first cell of the array is: " + arr[0]);
		System.out.println("The element in the third cell of the array is: " + arr[2]);
		
		arr[-1] = 1;

	}

}
