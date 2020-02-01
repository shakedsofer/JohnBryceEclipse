
public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public String toString() {
		String str = super.toString();
		return String.format("%s, width: %d, height: %d", str, width, height);
	}

}
