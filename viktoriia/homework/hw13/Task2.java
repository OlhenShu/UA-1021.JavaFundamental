package hw13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2 {
    static boolean validateDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        try {
            format.parse(date);  //check if it is a date
            Predicate<String> correctFormat = d -> {
                Pattern p = Pattern.compile("([0-9]{2}\\.){2}[0-9]{2}");
                Matcher m = p.matcher(d);
                return m.matches();
            };
            return correctFormat.test(date); // check year is only 2 integer
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String i1 = "23.15.3000";  // false
        String i2 = "05.04.2945";  // false
        String i3 = "24.12.3043";  // false
        String c1 = "17.08.35";  // true
        String c2 = "31.03.20";  // true
        System.out.println(validateDate(i1));
        System.out.println(validateDate(i2));
        System.out.println(validateDate(i3));
        System.out.println(validateDate(c1));
        System.out.println(validateDate(c2));
    }
}
