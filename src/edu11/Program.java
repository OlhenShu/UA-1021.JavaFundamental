package edu11;

import java.util.regex.*;

public class Program {
    public static void main(String[] args) {
        String pattern = "<[^>]*>";
        String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.print("Matches the entire text string");
        }
        m.reset();
        System.out.println();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}
