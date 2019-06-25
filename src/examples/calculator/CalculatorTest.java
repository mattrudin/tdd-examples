package examples.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Compute calcWithWholeNumber;
    private Compute calcWithRationalNumber;
    private float result;

    @BeforeEach
    void create() {
        calcWithWholeNumber = new Calculator(6);
        calcWithRationalNumber = new Calculator(5.5f);
    }

    @Test
    void addWholeNumberCorrectly() {
        result = calcWithWholeNumber.add(7).equals();

        assertEquals(13, result);
    }

    @Test
    void addRationalNumberCorrectly() {
        result = calcWithRationalNumber.add(7).equals();

        assertEquals(12.5, result);
    }

    @Test
    void subtractWholeNumberCorrectly() {
        result = calcWithWholeNumber.subtract(2).equals();

        assertEquals(4, result);
    }

    @Test
    void subtractRationalNumberCorrectly() {
        result = calcWithRationalNumber.subtract(2).equals();

        assertEquals(3.5, result);
    }

    @Test
    void multiplyWholeNumberCorrectly() {
        result = calcWithWholeNumber.multiply(5).equals();

        assertEquals(30, result);
    }

    @Test
    void multiplyRationalNumberCorrectly() {
        result = calcWithRationalNumber.multiply(5).equals();

        assertEquals(27.5, result);
    }

    @Test
    void divideWholeNumberCorrectly() {
        result = calcWithWholeNumber.divide(2).equals();

        assertEquals(3, result);
    }

    @Test
    void divideRationalNumberCorrectly() {
        result = calcWithRationalNumber.divide(2).equals();

        assertEquals(2.75, result);
    }
}