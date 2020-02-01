
public class Math {

	public static final double PI = 3.1415926;

	public Math() {

	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	public static double pow(double a, int b) {
		double result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	public static double calculateCircleArea(double radius) {
		return PI * pow(radius, 2);
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static int average(int a, int b, int c) {
		System.out.println("The integer version was called.");
		return (a + b + c) / 3;
	}

	public static double average(double x, double y, double z) {
		System.out.println("The double version was called.");
		return (x + y + z) / 3;
	}

	public static float average(float x, float y, float z) {
		System.out.println("The float version was called.");
		return (x + y + z) / 3;
	}

}
