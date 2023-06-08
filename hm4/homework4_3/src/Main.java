import java.util.Scanner;

public class Main {
    public enum HTTPError {
        ERROR_401(401, "Несанкціонований доступ"),
        ERROR_402(402, "Потрібна оплата"),
        ERROR_403(403, "Заборонено"),
        ERROR_404(404, "Не знайдено");


        private final int code;
        private final String name;

        HTTPError(int code, String name) {
            this.code = code;
            this.name = name;
        }


        public static String getName(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.code == code) {
                    return error.name;
                }
            }
            return "Невідома помилка";
        }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть код помилки: ");
        int errorCode = sc.nextInt();


        String errorName = HTTPError.getName(errorCode);


        System.out.println("Error Name: " + errorName);
    }
}