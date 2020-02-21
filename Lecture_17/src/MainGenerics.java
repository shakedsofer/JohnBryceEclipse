
public class MainGenerics {

	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		Box<Person> personBox = new Box<>();

		stringBox.setContent("abc");
		personBox.setContent(new Person("Rany", 33));

		System.out.printf("The content of the string box is: %s\n", stringBox);
		System.out.printf("The content of the person box is: %s\n", personBox);

	}

}
