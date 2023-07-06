package edu11;

public class Test {
    public static void main(String[] args) {
//        String userFile = null; // the file  is in folder C:\uffff
//        System.out.println(userFile);
//        userFile.trim(); // or strip()
        String lower = "lower";
        String upper = "UPPER";

        System.out.println(toTitleCase(lower).equals("Lower"));
        System.out.println(toTitleCase(upper).equals("Upper"));
    }

//    static String toTitleCase(String s) {
//        return s.substring(0, 1).toUpperCase() +
//            s.substring(1).toLowerCase();
//    }
static String toTitleCase(String s) {
    return Character.toTitleCase(s.charAt(0)) +
        s.substring(1).toLowerCase();
}
}
