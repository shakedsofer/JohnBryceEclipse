
public class Student {
	private static final int TOTAL_COURSES = 30;

	private String name;
	private int age;
	private Course[] courses;
	private int totalCourses;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.courses = new Course[TOTAL_COURSES];
		totalCourses = 0;
	}

	public void add(Course course) {
		if (totalCourses < courses.length) {
			courses[totalCourses++] = new Course(course);
		}
	}
	
	public String toString() {
		// TODO: Implement.
		return null;
	}
}
