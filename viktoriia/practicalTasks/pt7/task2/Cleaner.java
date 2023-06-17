package pt7.task2;

public class Cleaner extends Staff{
    final String TYPE_PERSON = "cleaner";

    public Cleaner() {
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Cleaner getting salary");
    }
}
