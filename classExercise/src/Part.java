
public class Part {

	private String namePart;
	private boolean fixed;

	public void fix() {
		fixed = true;
	}

	public boolean isFixed() {
		return this.fixed;
	}

	public String toString() {
		return namePart;
	}
}
