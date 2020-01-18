
public class Rectangle {

	private Point origin;
	private int width;
	private int height;

	public Rectangle(Point origin, int width, int height) {
		this.origin = new Point(origin);
		this.width = width;
		this.height = height;
	}

	public Point getOrigin() {
		return new Point(origin);

	}

	public void move(int dx, int dy) {
		this.origin = origin;
		origin.setX(origin.getX() + dx);
		origin.setY(origin.getX() + dy);

	}

}
