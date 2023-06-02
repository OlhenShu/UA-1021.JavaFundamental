import java.util.Scanner;

public class Multiply {

    static Scanner sc = new Scanner(System.in);

    static int multiply (int x, int y){
        int result = x * y;
        return result;
    }
    public static void main(String args[]) {
        System.out.println("insert x and y to multiply them: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("the result is " + multiply(x, y));
    }
}
