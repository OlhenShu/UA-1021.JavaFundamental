package pt13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    static List<String> sortList(List<String> list) {
        list.sort(String::compareTo);
        return list;
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Tom");
        test.add("John");
        test.add("Anna");
        test.add("Wilson");
        test.add("Britney");
        System.out.println("Before sorting: " + test);
        Task3.sortList(test);
        System.out.println("After sorting: " + test);
    }
}
