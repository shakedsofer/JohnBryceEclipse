
public class ExcellentStudent extends Student implements Learner, Polite {

	public ExcellentStudent(String name) {
		super(name);
	}

	@Override
	public String askQuestion() {
		return "Why is this?!";
	}

	@Override
	public void practice() {
		System.out.println("Practicing...");
	}

	@Override
	public void introduce() {
		sayHello();
		System.out.println("I'm an excellent student!");
	}

}
