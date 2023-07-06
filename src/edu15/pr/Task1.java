package edu15.pr;

//Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);)
public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
