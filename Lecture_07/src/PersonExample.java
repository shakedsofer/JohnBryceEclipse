
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("Yair", 30, 70);
		Person p2 = new Person("Rany", 37, 90);

		double ageDifference = p2.getAgeDifference(p1.age);

		System.out.println("The age difference is: " + ageDifference);
	}

}
