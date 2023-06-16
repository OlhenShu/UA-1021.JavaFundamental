package hw6.task1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feather, String layEggs) {
        super.feathers = feather;
        super.layEggs = layEggs;
    }
    @Override
    public void fly() {
        System.out.println("This bird can not fly");
    }
}
