package pt7.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Cat(), new Dog(), new Cat(), new Dog()};
        for (Animal animal: animals) {
            animal.voice();
            animal.feed();
        }
    }
}
