package pt9.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox());
        boxes.add(new HeavyBox(8, "tomato"));
        boxes.add(new HeavyBox(5, "dolls"));
        boxes.add(new HeavyBox(10, "tires"));
        boxes.add(new HeavyBox());
        boxes.add(new HeavyBox(3, "paper"));
        for(HeavyBox box: boxes) {
            System.out.println(box);
        }
        System.out.println("---------------------------------");
        boxes.get(0).setWeight(1);
        boxes.remove(boxes.size() - 1);
        for(HeavyBox box: boxes) {
            System.out.println(box);
        }
        System.out.println("---------------------------------");
        boxes.clear();
        for(HeavyBox box: boxes) {
            System.out.println(box);
        }
        System.out.println("---------------------------------");
    }
}
