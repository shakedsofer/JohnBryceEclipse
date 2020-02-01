
public class Test {

	public static void main(String[] args) {
//		Shape shape = new Shape("Shape1");
		Rectangle rect = new Rectangle("Rectangle1", 5, 12);
		Circle circle = new Circle("Circle1", 6);

//		System.out.println(shape.getName());
		System.out.println(rect.getName());

		System.out.printf("The area of the rectangle is %.2f\n", rect.getArea());
		System.out.printf("The area of the circle is %.2f", circle.getArea());

	}

}
