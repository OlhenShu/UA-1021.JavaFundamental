package pt11.task3;

public class Main {
    public static void main(String[] args) {
        String [] uns = {"valid", "no", "THIS_IS_TOO_LONG11", "VALID", "_VAl1_d", "Invalid symbol"};
        for (String un: uns) {
            if (UserName.validUsername(un)) {
                System.out.println("Yes, username '" + un + "' is valid");
            } else {
                System.out.println("No, username '" + un + "' is invalid");
            }
        }
    }
}
