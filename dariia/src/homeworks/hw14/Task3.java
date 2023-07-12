package homeworks.hw14;

// Create a thread «one», which would start the thread «two», which has to output its
// number («Thread number two») 3 times and create thread «three», which would to
// output message «Thread number three» 5 times
class MyRunnable implements Runnable {
    @Override
    public void run() {
    }
}

public class Task3 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("thread 1");
            Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread number two");
                    }
                    Thread t3 = new Thread(() -> {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("Thread number three");
                        }
                    });
                    t3.start();

                }
            );
            t2.start();
    });
    t1.start();
    }
}
