package hw8;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(new FullName("Mike", "Johnson"), 25, 8901);
		Student student2 = new Student(new FullName("Alice", "Brown"), 24, 267);
		
		try {
			Student copyOfStudent1 = (Student) student1.clone();
			copyOfStudent1.setCourseID(235);
			
			System.out.println(student1.info());
			System.out.println(student2.info());
			System.out.println(copyOfStudent1.info() + " (copy of student 2 with another course ID)");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
