
public class Main {

	public static void main(String[] args) {
		Person p = new Person("Rany", 33);
		Box b = new Box(p);
		b.setContent(4);
		Person contentPerson = (Person) b.getContent();

		System.out.printf("The content of the box is : %s\n", contentPerson);

	}

}
