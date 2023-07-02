package pt11.task1;

public class Main {
    public static void main(String[] args) {
        String s1 = "SoftServe";
        String s2 = "SoftServe Academy";
        String s3 = "Not a substring";
        System.out.println(IsASubstring.isSubstringOfFirst(s1, s2));
        System.out.println(IsASubstring.isSubstringOfFirst(s1, s3));
    }
}
