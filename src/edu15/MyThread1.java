package edu15;

class MyThread1 extends Thread {
    private final int number;
    private final int pause;

    public MyThread1(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }
@Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread " + number);
        }
    }
}

class Example {

    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread1(1, 100);
        Thread t2 = new MyThread1(2, 250);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread main");
    }
}
