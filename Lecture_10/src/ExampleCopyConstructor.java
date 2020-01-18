
public class ExampleCopyConstructor {

	public static void main(String[] args) {
		Point p1 = new Point(1.6, 78);
		Point p2 = new Point(23.5, 9.65);

		Point middlePoint = p1.getMiddle(p2);

		System.out.println(middlePoint);
	}
}
