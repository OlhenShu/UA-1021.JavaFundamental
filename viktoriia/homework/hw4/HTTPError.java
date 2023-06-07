package hw4;

import java.util.Scanner;

public enum HTTPError {
    BAD_REQUEST, //400
    UNAUTHORIZED, //401
    PAYMENT_REQUIRED, // 402
    FORBIDDEN, // 403
    NOT_FOUND, // 404
    METHOD_NOT_ALLOWED, // 405
    NOT_ACCEPTABLE, // 406
    REQUEST_TIMEOUT; // 408
    // list is not completed to not make decision too long
    public static HTTPError nameOfError(int number) {
        switch (number) {
            case 400:
                return BAD_REQUEST;
            case 401:
                return UNAUTHORIZED;
            case 402:
                return PAYMENT_REQUIRED;
            case 403:
                return FORBIDDEN;
            case 404:
                return NOT_FOUND;
            case 405:
                return METHOD_NOT_ALLOWED;
            case 406:
                return NOT_ACCEPTABLE;
            case 408:
                return REQUEST_TIMEOUT;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of error:");
        int error = scanner.nextInt();
        System.out.println(nameOfError(error));
    }
}

