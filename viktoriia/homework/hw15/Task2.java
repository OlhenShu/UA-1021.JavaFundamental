package hw15;

public class Task2 {
    static Object first = new Object();
    static Object second = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (first) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (second) {
                    System.out.println("Thread first success");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (second) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (first) {
                    System.out.println("Thread second success");
                }
            }
        });
        thread1.start();
        thread2.start();
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());*/
    }
}
