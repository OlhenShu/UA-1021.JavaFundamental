package edu09;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(0,"Null");
       // list.add(9, "Ten");
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
