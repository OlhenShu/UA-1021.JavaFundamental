package edu07.composition;

public class Ram {
    private int value;

    public Ram(int value) {
        this.value = value;
    }
    public void working(){
        System.out.println("I'm working");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
