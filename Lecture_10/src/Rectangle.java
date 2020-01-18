
public class Rectangle {
	private Point origin;
	private int width;
	private int height;

	public Rectangle(Point origin, int width, int height) {
		this.origin = new Point(origin);
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return String.format("Origin: %s\nWidth: %d\nHeight: %d", origin, width, height);
	}

	public void move(int dx, int dy) {
		origin.move(dx,dy);
	}

	public Point getOrigin() {
		return new Point(origin);
	}
}
