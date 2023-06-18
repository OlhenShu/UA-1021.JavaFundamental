package hw8;

public class Student extends Person {

	private int courseID;

	public Student(FullName fullName, int age, int courseID) {
		super(fullName, age);
		this.setCourseID(courseID);
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	@Override
	public String info() {
		return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: "
				+ super.getAge() + ", Course ID: " + this.courseID;
	}

	@Override
	public String activity() {
		return "I study at university";
	}

}
