
public class ArrayUtils {
	
	/**
	 * Gets the maximum value in a given array.
	 * @param arr The given array.
	 * @return The maximum value in the array.
	 */
	public static double getMaximumValue(double[] arr) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int indexOf(double value, double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static double getSum(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void foo(int[] arr, int value) {
		arr[1] = 8;
		value = 5;
	}
}
