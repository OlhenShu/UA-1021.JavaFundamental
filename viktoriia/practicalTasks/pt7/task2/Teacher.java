package pt7.task2;

public class Teacher extends Staff{
    final String TYPE_PERSON = "teacher";

    public Teacher() {
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Teacher getting salary");
    }
}
