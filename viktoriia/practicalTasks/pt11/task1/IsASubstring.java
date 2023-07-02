package pt11.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsASubstring {
    static boolean isSubstringOfFirst(String s1, String s2) {
        Pattern p = Pattern.compile(s1);
        Matcher m = p.matcher(s2);
        return m.find();
    }
}
