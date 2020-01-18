
public class Point {
	private double x;
	private double y;

	public Point() {
		/* Empty */
	}

	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

	public Point(Point p) {
		this(p.x, p.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		// (1,2)
		return String.format("(%.2f,%.2f)", x, y);
	}

	public boolean equals(Point p) {
		return this.x == p.x && this.y == p.y;
	}

	public Point getMiddle(Point p) {
		return new Point((x + p.x) / 2, (y + p.y) / 2);
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
