
public class PersonExampleBMI {

	public static void main(String[] args) {
		Person p1 = new Person("Yair", 30, 70, 189);

		if (p1.isHealthy()) {
			System.out.println(p1.getName() + " is healthy!");
		} else {
			System.out.println(p1.getName() + " needs to see a doctor!");
		}
	}
}
