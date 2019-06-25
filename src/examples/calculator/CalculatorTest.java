package examples.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Compute calcWithWholeNumber;
    private Compute calcWithRationalNumber;
    private float result;
    private float expected;

    @BeforeEach
    void create() {
        calcWithWholeNumber = new Calculator(6);
        calcWithRationalNumber = new Calculator(5.5f);
    }

    @Test
    void addWholeNumberCorrectly() {
        expected = 13;

        result = calcWithWholeNumber.add(7).equals();

        assertEquals(expected, result);
    }

    @Test
    void addRationalNumberCorrectly() {
        expected = 12.5f;

        result = calcWithRationalNumber.add(7).equals();

        assertEquals(expected, result);
    }

    @Test
    void subtractWholeNumberCorrectly() {
        expected = 4;

        result = calcWithWholeNumber.subtract(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void subtractRationalNumberCorrectly() {
        expected = 3.5f;

        result = calcWithRationalNumber.subtract(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void multiplyWholeNumberCorrectly() {
        expected = 30;

        result = calcWithWholeNumber.multiply(5).equals();

        assertEquals(expected, result);
    }

    @Test
    void multiplyRationalNumberCorrectly() {
        expected = 27.5f;

        result = calcWithRationalNumber.multiply(5).equals();

        assertEquals(expected, result);
    }

    @Test
    void divideWholeNumberCorrectly() {
        expected = 3;

        result = calcWithWholeNumber.divide(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void divideRationalNumberCorrectly() {
        expected = 2.75f;

        result = calcWithRationalNumber.divide(2).equals();

        assertEquals(expected, result);
    }
}