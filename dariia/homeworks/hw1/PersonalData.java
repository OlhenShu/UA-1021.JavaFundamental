import java.util.Scanner;

public class PersonalData {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Please, enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please, enter your address: ");
        String address = sc.nextLine();

        System.out.println("Your data \nName : "+name+"\nAddress : "+address);
    }
}
