
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

	public Point getMiddle(Point P) {

		double centerPointX = (x + P.x) / 2;
		double centerPointY = (y + P.y) / 2;

		Point centerPoint = new Point(centerPointX, centerPointY);

		return centerPoint;
	}
}