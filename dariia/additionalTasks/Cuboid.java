import java.util.Scanner;
class Cuboid{

    static Scanner sc = new Scanner(System.in);

    static float volume(float x, float y, float z){
        float result = x * y * z;
        return result;
    }
    public static void main (String args[]){
        System.out.println("plase insert the length, width and hight of cubloid (use float type of data with coma): ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        float hight = sc.nextFloat();

        System.out.printf("the volume is %.2f", volume(length, width, hight));
    }
}