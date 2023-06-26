package homework6;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying!");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Non-flying bird is not able to fly!");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring through the sky!");
    }
}

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying gracefully!");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Penguin waddles on the ground, unable to fly.");
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(false, true);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi is a flightless bird, unable to fly.");
    }
}

public class main {
    public static void main (String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println("Feathers: " + bird.hasFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println();
        }
    }
}

