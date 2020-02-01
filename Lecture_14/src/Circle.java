
public class Circle extends Shape {
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString() {
		String str = super.toString();
		return String.format("%s, radius is %d", str, radius);
	}
}
