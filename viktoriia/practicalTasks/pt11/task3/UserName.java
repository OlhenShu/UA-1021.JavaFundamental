package pt11.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
    static boolean validUsername(String username) {
        Pattern p = Pattern.compile("[\\w]{3,15}");
        Matcher m = p.matcher(username);
        return m.matches();
    }
}
