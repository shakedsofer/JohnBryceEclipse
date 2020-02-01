
// ArrayUtilsTest.java
public class ArrayUtilsTest {

	public static void main(String[] args) {
		double[] values = { -6, 9, 23.7, -7.1, 8, 34, 98.2, 43, 23, 87, 44, -76, -34 };

		double maxValue = ArrayUtils.getMaximumValue(values);
		double valueToFind = 43;

		int indexOfValue = ArrayUtils.indexOf(valueToFind, values);
		double sum = ArrayUtils.getSum(values);

		System.out.printf("The maximum value in the array is: %f\n", maxValue);
		System.out.printf("The value %f was found at index %d\n", valueToFind, indexOfValue);
		System.out.printf("The sum of all values is: %f\n", sum);

		int[] arr = { 1, 2, 3, 4 };
		int value = 0;

		ArrayUtils.foo(arr, value);

		System.out.println(arr[1]);
		System.out.println(value);
	}

}
