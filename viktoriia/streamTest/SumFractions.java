package streamTest;

import java.util.Arrays;
import java.util.List;

public class SumFractions {
    public static class Fraction {
        int num;
        int denom;

        public Fraction(int num, int denom) {
            this.num = num;
            this.denom = denom;
        }
    }
    public static String sumFracts(int[][] l) {
        if (l == null || l.length == 0) {
            return null;
        }
        List<Fraction> fractions = Arrays.stream(l)
                .map(x -> new Fraction(x[0], x[1]))
                .toList();
        Fraction result = fractions.stream()
                .reduce(new Fraction(0, 1), (subtotal, element) -> {
                    int newDenom = (subtotal.denom * element.denom) / gcd(subtotal.denom, element.denom);
                    int newNum = (subtotal.num * newDenom) / subtotal.denom + ((element.num * newDenom) / element.denom);
                    int divisor = gcd(newNum, newDenom);
                    newDenom/= divisor;
                    newNum/= divisor;
                    return new Fraction(newNum, newDenom);
                });
        if (result.num % result.denom == 0) {
            return String.valueOf(result.num / result.denom);
        }
        return "[" + result.num + ", " + result.denom + "]";
    }

    public static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        System.out.println(SumFractions.sumFracts(new int[][] { {1, 2}, {1, 3}, {1, 4} }));  //13, 12
        System.out.println(SumFractions.sumFracts(new int[][] { {1, 3}, {5, 3} }));  //2
        System.out.println(SumFractions.sumFracts(new int[][] {}));  //null
    }
}
