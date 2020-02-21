
public class ExcellentLecturer extends Employee implements Lecturer, Polite {

	public ExcellentLecturer(String name) {
		super(name);
	}

	@Override
	public void answerQuestion(String question) {
		System.out.printf("The answer to the question \"%s\", is: %s\n", question, "because this and that!");

	}

	@Override
	public void prepare() {
		System.out.println("Preparing...");

	}

	@Override
	public void introduce() {
		sayHello();
		System.out.println("I'm an amazing lecturer!");
		
	}

}
