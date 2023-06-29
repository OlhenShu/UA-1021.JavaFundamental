package hw10;
import java.util.*;

public class Task1 {
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet();
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }

    public static Set intersect(Set s1, Set s2) {
        Set result = new HashSet();
        result.addAll(s1);
        result.retainAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        Set<Integer> un = Task1.union(set1, set2);
        System.out.println("Union: " + un);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        Set<Integer> in = Task1.intersect(set1, set2);
        System.out.println("Intersect: " + in);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
    }
}
