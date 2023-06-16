package hw6.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle("black", "lay max 4"),
                new Kiwi("brown", "lay max 6"),
                new Penguin("black and white", "lay max 2"),
                new Swallow("white", "lay max 5"),
                new Swallow("black", "lay max 5"),
                new Penguin("black, white and yellow", "lay only 1")};
        for(Bird bird: birds){
            bird.fly();
        }
    }
}
