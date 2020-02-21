
public class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.printf("Hello, my name is %s and I'm an employee!\n", name);
	}

}
