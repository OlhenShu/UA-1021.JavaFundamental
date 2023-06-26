package pt9.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(25));
        }
        System.out.println(myCollection);

        LinkedList<Integer> newCollection = new LinkedList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5) {
                newCollection.add(i + 1);
            }
        }
        System.out.println(newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println(myCollection);

        myCollection.add(2-1, 1);
        myCollection.add(8-1, -3);
        myCollection.add(5-1, -4);
        for(int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + (i + 1) + ", value of element - " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        Collections.sort(newCollection);
        System.out.println(myCollection);
        System.out.println(newCollection);
    }
}
