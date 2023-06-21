package hw8;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + this.course;
    }

    @Override
    protected String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.fullName = (FullName) cloned.fullName.clone();
        return cloned;
    }
}
