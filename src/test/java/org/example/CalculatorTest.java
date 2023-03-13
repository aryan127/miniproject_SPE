package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding for true once", 120, calculator.fact(5), DELTA);
        assertEquals("Finding for true once", 24, calculator.fact(4), DELTA);
        assertEquals("Finding for true once", 2, calculator.fact(2), DELTA);
        assertEquals("Finding for true once", 1, calculator.fact(1), DELTA);
        assertEquals("Finding for true once", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding for false once", 1120, calculator.fact(5), DELTA);
        assertNotEquals("Finding for false once", 124, calculator.fact(4), DELTA);
        assertNotEquals("Finding for false once", 2, calculator.fact(3), DELTA);
        assertNotEquals("Finding for false once", 1, calculator.fact(2), DELTA);
        assertNotEquals("Finding for false once", 0, calculator.fact(1), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding for true once", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding for true once", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding for true once", 256, calculator.power(4, 4), DELTA);
        assertEquals("Finding for true once", 125, calculator.power(5, 3), DELTA);
        assertEquals("Finding for true once", 4, calculator.power(2, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding for false once", 10, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding for false once", 8, calculator.power(2, 4), DELTA);
        assertNotEquals("Finding for false once", 4, calculator.power(2, 5), DELTA);
        assertNotEquals("Finding for false once", 2, calculator.power(2, 6), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding for true once", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding for false once", 60, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding for false once", 4.7, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding for true once", 5, calculator.squareRoot(25), DELTA);
        assertEquals("Finding for true once", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding for true once", 3, calculator.squareRoot(9), DELTA);
        assertEquals("Finding for true once", 2, calculator.squareRoot(4), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding for false once", 4, calculator.squareRoot(25), DELTA);
        assertNotEquals("Finding for false once", 5, calculator.squareRoot(16), DELTA);
        assertNotEquals("Finding for false once", 2, calculator.squareRoot(9), DELTA);
        assertNotEquals("Finding for false once", 3, calculator.squareRoot(4), DELTA);

    }
}