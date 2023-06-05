package edu07.composition;

public class ComputerTest {
    public static void main(String[] args) {
        Ram ram = new Ram(16);
        Ssd ssd = new Ssd(512);
        Computer computer = new Computer(ram,ssd);

        computer.printInfo();

    }


}
