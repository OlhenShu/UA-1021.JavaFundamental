package edu08;

public class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }

    public static void main(String[] args) {
        Person person = new Person(new FullName("Mike", "Green"), 25);
        try {
            Person copyOfPerson = (Person) person.clone();
            System.out.println("Original: " + person.fullName.getFirstNameString() + " " +
                person.fullName.getLastNameString() + ", " + person.age);
            System.out.println("Cloned: " + copyOfPerson.fullName.getFirstNameString() + " " +
                copyOfPerson.fullName.getLastNameString() + ", " + copyOfPerson.age);
            copyOfPerson.fullName.setFirstNameString("Nick");
            copyOfPerson.fullName.setLastNameString("Brown");
            copyOfPerson.age = 37;
            System.out.println("=========================");
            System.out.println("Original: " + person.fullName.getFirstNameString() + " " +
                person.fullName.getLastNameString() + ", " + person.age);
            System.out.println("Cloned: " + copyOfPerson.fullName.getFirstNameString() + " " +
                copyOfPerson.fullName.getLastNameString() + ", " + copyOfPerson.age);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
    }

}