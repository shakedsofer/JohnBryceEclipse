public class JohnBryce {

	private static final int MAX_LEARNERS = 20;

	public static void main(String[] args) {
		Learner[] learners = new Learner[MAX_LEARNERS];
		for (int i = 0; i < learners.length; i++) {
			learners[i] = new ExcellentStudent("student #" + (i + 1));
		}

		Lecturer lecturer = new Lecturer() {

			@Override
			public void prepare() {
				System.out.println("Let's party until the sun comes up!");
			}

			@Override
			public void answerQuestion(String question) {
				System.out.println("Don't ask hard questions! ;-P");
			}
		};

		startLecture(learners, lecturer);
	}

	private static void startLecture(Learner[] learners, Lecturer lecturer) {
		for (int i = 0; i < learners.length; i++) {

			if (learners[i] instanceof Polite) {
				Polite polite = (Polite) learners[i];
				polite.introduce();
			}

			String question = learners[i].askQuestion();

			System.out.println(question);

			if (lecturer instanceof Polite) {
				Polite polite = (Polite) lecturer;
				polite.introduce();
			}

			lecturer.answerQuestion(question);
			learners[i].practice();
		}

		lecturer.prepare();
	}

}
