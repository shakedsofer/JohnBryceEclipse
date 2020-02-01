
public class TestPolymorphism {

	private static final int SHAPES = 8;

	public static void main(String[] args) {
		Shape[] shapes = new Shape[SHAPES];

		shapes[0] = new Rectangle("Rectangle0", 7, 2);
		shapes[1] = new Circle("Circle1",8);
		shapes[2] = new Rectangle("Rectangle2", 5, 90);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}

	}

}
