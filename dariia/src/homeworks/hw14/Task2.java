package homeworks.hw14;

// NEEDS TO BE RE-DONE!!!! NOT COMPLETED YET
// Cause a deadlock. Organize the expectations of ending a thread in main(),
// and make the end of the method main() in this thread

public class Task2 extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();
    static Thread t1 = new Thread(() -> {
        synchronized (first) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (second) {
                System.out.println("Success!");
            }
        }
    });


    static Thread t2 = new Thread(() -> {
        synchronized (second) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (first) {
                System.out.println("Success!");
            }
        }
    });

    public static void main(String[] args) {
        t1.start();
        t2.start();
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

//    public static void main(String[] args) {
//        Object res1 = new Object();
//        Object res2 = new Object();
//
//        Thread t1 = new Thread(() -> {
//            synchronized (res1) {
//                System.out.println("thread 1 put hands on res1");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (res2) {
//                    System.out.println("thread 1 put hands on res2");
//                }
//            }
//
//        });
//
//
//        Thread t2 = new Thread(() -> {
//            synchronized (res1) {
//                System.out.println("thread 2 put hands on res2");
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (res2) {
//                    System.out.println("thread 2 put hands on res1");
//                }
//            }
//
//        });
//
//        t1.start();
//        t2.start();
//    }

}


