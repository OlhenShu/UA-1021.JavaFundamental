package edu09.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * In main() method declare a collection myCollection of 10 integers and fill it (from the
 * console or random):
 * * Find and save in list newCollection all positions of element more than 5 in the
 * collection. Output newCollection to the console;
 * * Remove from collection myCollection elements, which are greater then 20. Output the
 * result
 * * Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position –
 * xxx, value of element – xxx”
 * * Sort and print collection.
 */
public class ThirdTaskDemo {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> myCollection = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            myCollection.add(rnd.nextInt(50));
        }
        System.out.println("Initial collection " + myCollection);

        //position (index)
        List<Integer> newMyCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++){
            if(myCollection.get(i) > 5){
                newMyCollection.add(i);
            }
        }
        System.out.println("Positions of element more than 5 " + newMyCollection);

//        for (int i = 0; i < myCollection.size(); i++){
//           Integer element = myCollection.get(i);
//            if(element > 20){
//                myCollection.remove(element); //position (index)
//            }
//        }
        var iterator = myCollection.iterator();
        while (iterator.hasNext()){
            var elements = iterator.next();
            if (elements > 20){
                iterator.remove();
            }
        }

        System.out.println(myCollection);

        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);

        for( int i = 0; i < myCollection.size(); i++){
            System.out.println("Position " + i + " Value is "+ myCollection.get(i));
        }

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted collection: " + myCollection);
    }


}
