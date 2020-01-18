
public class RectangleExample {

	public static void main(String[] args) {
		Point p1  = new Point(1,2);
		Rectangle rect = new Rectangle(p1, 10, 20);
		
		System.out.println(rect);
		
		rect.move(2, 3);
		
		System.out.println(rect);

	}

}
