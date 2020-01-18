
public class Person {
	private String name;
	private double age;
	private double weightKg;
	private double heightCm;

	public Person() {
		/* Empty */
	}

	public Person(String n) {
		this(n, 0);
	}

	public Person(String n, double a) {
		this(n, a, 0, 0);
	}

	public Person(String n, double a, double w, double h) {
		setName(n);
		setAge(a);
		setWeightKg(w);
		setHeightCm(h);
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " weight KG: " + weightKg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(double age) {
		if (age > 0 && age <= 120) {
			this.age = age;
		}
	}

	public void setWeightKg(double weightKg) {
		if (weightKg > 0 && weightKg <= 400) {
			this.weightKg = weightKg;
		}
	}

	public void setHeightCm(double heightCm) {
		if (heightCm > 0 && heightCm <= 300) {
			this.heightCm = heightCm;
		}
	}

	public String getName() {
		return name;
	}

	public double getAge() {
		return age;
	}

	public double getWeightKg() {
		return weightKg;
	}

	public double getHeightCm() {
		return heightCm;
	}

	public double getAgeDifference(double otherAge) {
		double diff = this.age - otherAge;

		if (diff < 0) {
			diff = -diff;
		}

		return diff;
	}
	
	public boolean isHealthy() {
		double bmi = calculateBMI();

		return bmi > 18.5 && bmi < 25;
	}

	private double calculateBMI() {
		double heightMeters = heightCm * .01;
		return weightKg / (heightMeters * heightMeters);
	}
}
