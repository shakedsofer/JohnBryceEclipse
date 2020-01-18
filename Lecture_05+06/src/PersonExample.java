
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("Rany", 33, 90);
		Person p2 = new Person();
		Person p3 = new Person("David", 700);

		System.out.println(
				"Hi, my name is " + p1.name + " I'm " + p1.age + " years old, and my weight is " + p1.weightKg + " KG");
		System.out.println(
				"Hi, my name is " + p2.name + " I'm " + p2.age + " years old, and my weight is " + p2.weightKg + " KG");
		System.out.println(
				"Hi, my name is " + p3.name + " I'm " + p3.age + " years old, and my weight is " + p2.weightKg + " KG");

	}

}
