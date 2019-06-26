package examples.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    private Compute calcWithPositiveWholeNumber;
    private Compute calcWithPositiveRationalNumber;
    private Compute calcWithNegativeWholeNumber;
    private Compute calcWithNegativeRationalNumber;
    private float result;
    private float expected;

    @BeforeEach
    void create() {
        calcWithPositiveWholeNumber = new Calculator(6);
        calcWithPositiveRationalNumber = new Calculator(5.5f);
        calcWithNegativeWholeNumber = new Calculator(-6);
        calcWithNegativeRationalNumber = new Calculator(-5.5f);
    }

    @Test
    void addPositiveWholeNumberCorrectly() {
        expected = 13;

        result = calcWithPositiveWholeNumber.add(7).equals();

        assertEquals(expected, result);
    }

    @Test
    void addPositiveRationalNumberCorrectly() {
        expected = 12.5f;

        result = calcWithPositiveRationalNumber.add(7).equals();

        assertEquals(expected, result);
    }

    @Test
    void addNegativeWholeNumberCorrectly() {
        expected = -3;

        result = calcWithNegativeWholeNumber.add(3).equals();

        assertEquals(expected, result);
    }

    @Test
    void addTwoNegativeWholeNumbersCorrectly() {
        expected = -9;

        result = calcWithNegativeWholeNumber.add(-3).equals();

        assertEquals(expected, result);
    }

    @Test
    void addNegativeRationalNumberCorrectly() {
        expected = -3;

        result = calcWithNegativeRationalNumber.add(2.5f).equals();

        assertEquals(expected, result);
    }

    @Test
    void subtractPositiveWholeNumberCorrectly() {
        expected = 4;

        result = calcWithPositiveWholeNumber.subtract(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void subtractPositiveRationalNumberCorrectly() {
        expected = 3.5f;

        result = calcWithPositiveRationalNumber.subtract(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void multiplyPositiveWholeNumberCorrectly() {
        expected = 30;

        result = calcWithPositiveWholeNumber.multiply(5).equals();

        assertEquals(expected, result);
    }

    @Test
    void multiplyPositiveRationalNumberCorrectly() {
        expected = 27.5f;

        result = calcWithPositiveRationalNumber.multiply(5).equals();

        assertEquals(expected, result);
    }

    @Test
    void dividePositiveWholeNumberCorrectly() {
        expected = 3;

        result = calcWithPositiveWholeNumber.divide(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void dividePositiveRationalNumberCorrectly() {
        expected = 2.75f;

        result = calcWithPositiveRationalNumber.divide(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () ->
                calcWithPositiveRationalNumber.divide(0)
        );
    }
}