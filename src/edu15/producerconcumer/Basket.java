package edu15.producerconcumer;

public class Basket {
    private String fruit;
    private volatile boolean fruitIsAvailable = false;

    synchronized String pushFruit() {
        while (!fruitIsAvailable) try {
            wait();
        } catch (InterruptedException e) {
        }
        System.out.println("Get: " + fruit);
        fruitIsAvailable = false;
        notify();
        return fruit;
    }

    synchronized void putFruit(String fruit) {
        while (fruitIsAvailable) try {
            wait();
        } catch (InterruptedException e) {
        }
        this.fruit = fruit;
        fruitIsAvailable = true;
        System.out.println("Put: " + fruit);
        notify();
    }
}