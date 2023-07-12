package hw15;

public class Task3 {
    public static void main(String[] args) {
        // main supposed to be thread "one"
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                Thread thread3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Thread number three");
                        }
                    }
                }, "three");
                thread3.start();
            }
        }, "two");
        thread2.start();
    }
}
