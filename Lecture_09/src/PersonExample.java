
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("Yair", 30, 70, 189);

		String name = p1.getName();

		p1.setName("Yehuda");
		p1.setAge(-1);
		p1.setWeightKg(-290);

		String changedName = p1.getName();

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getWeightKg());
	}
}
