
public class Test2 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		double radius = 3.5;

		double area = Math.calculateCircleArea(radius);
		int max = Math.max(a, b);

		System.out.println("Area is: " + area);
		System.out.println("Max is: " + max);
		System.out.println("a^b is: " + Math.pow(a, b));

	}

}
