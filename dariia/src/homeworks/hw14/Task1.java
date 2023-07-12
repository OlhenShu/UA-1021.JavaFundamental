package homeworks.hw14;

// Run three threads and output there different messages for 5 times.
// The third thread supposed to start after finishing working of the two previous threads.

public class Task1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> printMessage("this is thread #1 running"));
        Thread t2 = new Thread(() -> printMessage("here we got thread #2"));
        Thread t3 = new Thread(() -> printMessage("thread #3 started"));


        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();

    }

    public static void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}

//class myThread extends Thread {
//
//    public myThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(this.getName() + " : " + this.getState());
//        }
//    }
//}

//class myRunnable implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("running thread");
//    }
//}
