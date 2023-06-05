package edu07.castingObj;

class Aclass {
    int field1 = 10;
}

class Bclass extends Aclass {
    int field2 = 20;
}

//    Aclass a = new Aclass();
//    Bclass b = new Bclass();
//
//    a=b;
//  b = a; ???

class TestBEqualsA {
    public static void main(String[] args) {
        Aclass a = new Aclass();
        Bclass b = new Bclass();
       // a=b;
       // b = a;

        if (a instanceof Bclass) {
            b = (Bclass) a;
        }
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}
