
public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.printf("Hello, my name is %s and I'm a student!\n", name);
	}

}
