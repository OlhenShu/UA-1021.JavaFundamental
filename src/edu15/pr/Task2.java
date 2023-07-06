package edu15.pr;

//Output two messages «Hello, world» and «Peace in the peace» 5 times each \
// with the intervals of 2 seconds, and the second - 3 seconds.
// After printing messages, print the text «My name is …»
public class Task2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    //ex.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    //ex.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is Olha");
    }
}
