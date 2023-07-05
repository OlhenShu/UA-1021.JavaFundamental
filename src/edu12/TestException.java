package edu12;

/**
 * @throws ArithmeticException
 */
public class TestException {
    public static void main(String[] args) {
        //System.out.println(info());
        try{
//            System.out.println("Hello");
//            System.exit(0);
Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(" Good bye");
        }
    }

    static String info() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i " + i);
            try {
                if( i == 2)
                    throw new RuntimeException();
            } finally {
                continue;
            }
        }
        return "";
    }

}