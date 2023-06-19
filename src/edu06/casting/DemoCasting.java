package edu06.casting;

public class DemoCasting {
    public static void main(String[] args) {
        int i = 100;
        long lg = i;   // no explicit type casting required
        float fl = lg;
        System.out.println(i);
        System.out.println(lg);
        System.out.println(fl);


        double d = 12345678963333.08;
        double l = 7.5;

        int a = (int) d;
        int b = (int) l;

        System.out.println(a);
        System.out.println(b);
    }
}
