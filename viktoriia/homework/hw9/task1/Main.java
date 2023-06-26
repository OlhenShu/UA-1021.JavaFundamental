package hw9.task1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100) * (random.nextBoolean() ? 1 : (-1)));
        }
        System.out.println(myCollection);

        int max = myCollection.get(0);
        int maxIndex = 0;
        int min = myCollection.get(0);
        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                maxIndex = i;
            }
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minIndex = i;
            }
        }
        myCollection.set(minIndex, max);
        myCollection.set(maxIndex, min);
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) < 0) {
                myCollection.add(i, random.nextInt(100, 999));
                myCollection.add(i, random.nextInt(100, 999));
                myCollection.add(i, random.nextInt(100, 999));
                break;
            }
        }
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i+1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println(myCollection);

        int k = 5;
        ArrayList<Integer> copy = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            copy.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= k; i--) {
            copy.add(myCollection.get(i));
        }
        System.out.println(copy);

        int indexLastEven = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) % 2 == 0) {
                indexLastEven = i;
            }
        }
        if (indexLastEven < 0) {
            System.out.println("There is no even element");
        } else {
            myCollection.remove(indexLastEven);
        }
        System.out.println(myCollection);

        minIndex = myCollection.indexOf(min);
        if(minIndex + 1 < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }
        System.out.println(myCollection);
    }
}
