package edu05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

//    @BeforeEach
//    void setUp() {
//        System.out.println("@BeforeEach");
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.out.println("@AfterEach");
//    }

    @Test
    void add() {
        assertEquals(5,Calculator.add(2,3));
    }

    @Test
    void addPositiveToNegative() {
        //assertEquals(-1,Calculator.add(2,-3));
        int result = Calculator.add(2,-3);
        assertEquals(-1,result);
    }

    @Test
    void subtract() {
        int result = Calculator.subtract(2,-3);
        assertEquals(5,result);
    }

    @Test
    void product() {
        int result = Calculator.product(2,-3);
        assertEquals(-6,result);
    }

    @Test
    void divide() {
        int result = Calculator.divide(6,-3);
        assertEquals(-2,result);
    }
    @Test
    void divideByZero() {
       assertThrows(IllegalArgumentException.class, () -> {
          Calculator.divide(6,0);
        });
    }
}