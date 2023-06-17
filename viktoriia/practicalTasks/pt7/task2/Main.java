package pt7.task2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {new Student(), new Student(), new Cleaner(), new Student(), new Teacher()};
        for (Person person: persons) {
            person.print();
            if(person instanceof Teacher || person instanceof Cleaner) {
                ((Staff) person).salary();
            }
        }
    }
}
