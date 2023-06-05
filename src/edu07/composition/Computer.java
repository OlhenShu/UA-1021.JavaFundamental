package edu07.composition;

public class Computer {

    private final Ram ram;
    private final Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printInfo(){
        System.out.println("Computer: ram" + ram.getValue() +
            "ssd" + ssd.getValue());
    }
}
