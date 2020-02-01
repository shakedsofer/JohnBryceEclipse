
public class TestAbstract {

	public static void main(String[] args) {
		Circle c = new Circle("SomeCircle", 67);
		
		printShapeArea(c);

	}

	public static void printShapeArea(Shape shape) {
		System.out.println(shape.getArea());
	}

}
