
public class Person {
	public String name;
	public double age;
	public double weightKg;

	public Person() {
		/* Empty */
	}
	
	public Person(String n, double a) {
		this(n, a, -1);
	}

	public Person(String n, double a, double w) {
		this.name = n;
		this.age = a;
		this.weightKg = w;
	}
}
