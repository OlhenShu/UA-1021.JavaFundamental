package edu10;

import java.util.Objects;

public class Person {
    int idPerson;
    String firstName;
    String lastName;

    public Person(int idPerson, String firstName, String lastName) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (idPerson != person.idPerson) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        return Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        int result = idPerson;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}

 class Program {
    public static void main(String[] args) {
        Person person1 = new Person(1, "John", "Smith");
        Person person2 = new Person(1, "John", "smith");

        System.out.println("HashCode person1: "+person1.hashCode());
        System.out.println("HashCode person2: "+person2.hashCode());

        System.out.println("Equals: "+person1.equals(person2));
    }
}
