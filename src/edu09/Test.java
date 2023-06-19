package edu09;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //  Integer object = new Integer(1);
        Integer i = Integer.valueOf(128);
        Integer one = 128;

        System.out.println(i.equals(one));

        Object[] arr = {1, "Hello world", LocalDate.now()};
        Number[] nums = {1, 1.0, (byte)12};

        for( var el : nums){
            System.out.println(nums.getClass().getName());
        }

    }
}
