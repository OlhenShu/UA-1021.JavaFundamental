package hw6.task1;

public class FlyingBird extends Bird {
    public FlyingBird(String feather, String layEggs) {
        super.feathers = feather;
        super.layEggs = layEggs;
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
}
