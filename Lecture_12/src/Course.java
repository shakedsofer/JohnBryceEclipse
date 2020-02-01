
public class Course {
	private String name;
	private int rate;

	public Course(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Course(Course c) {
		this(c.name, c.rate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String toString() {
		return String.format("Name: %s, Rate: %d", name, rate);
	}

}
