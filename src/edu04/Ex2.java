package edu04;

public class Ex2 {
    public static void main(String[] args) {
        int t = 5;
        int s = 4;
        int v = 7;

        System.out.println((t > s) && (t > v) || (s < v));//true && false =>false || true
        //System.out.println(t > s || t > v && s > v);
      // System.out.println(t > s || (t > v && s > v));
    }

}
