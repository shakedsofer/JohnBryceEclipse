public class TestException3 {

	public static void main(String[] args) {

		try {
			// ArrayIndexOutOfBoundsException
			int[] arr = { 34, 3, 1, 45 };
			int index = 4;

			System.out.println(arr[index]);

			// ArithmeticException
			int a = 5;
			int b = 1;
			int c = a / b;

			Point p = null;
			p.setX(5);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
