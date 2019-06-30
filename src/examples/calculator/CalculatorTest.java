package examples.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

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

    @Test
    void takesCorrectSquareRootOfWholeNumber() {
        expected = 2.45f;

        result = calcWithPositiveWholeNumber.root().roundTo(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void takesCorrectSquareRootOfRationalNumber() {
        expected = 2.35f;

        result = calcWithPositiveRationalNumber.root().roundTo(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void squaresPositiveWholeNumberCorrectly() {
        expected = 36;

        result = calcWithPositiveWholeNumber.square().equals();

        assertEquals(expected, result);
    }

    @Test
    void squaresPositiveRationalNumberCorrectly() {
        expected = 30.25f;

        result = calcWithPositiveRationalNumber.square().equals();

        assertEquals(expected, result);
    }

    @Test
    void squaresNegativeWholeNumberCorrectly() {
        expected = 36;

        result = calcWithNegativeWholeNumber.square().equals();

        assertEquals(expected, result);
    }

    @Test
    void calculatesToPowerNPositiveWholeNumberCorrectly() {
        expected = 1296;

        result = calcWithPositiveWholeNumber.toPower(4).equals();

        assertEquals(expected, result);
    }

    @Test
    void calculatesToPowerNPositiveRationalNumberCorrectly() {
        expected = 166.38f;

        result = calcWithPositiveRationalNumber.toPower(3).roundTo(2).equals();

        assertEquals(expected, result);
    }

    @Test
    void roundPositiveRationalNumberToNPlace() {
        expected = 6;

        result = calcWithPositiveRationalNumber.roundTo(0).equals();

        assertEquals(expected, result);
    }

    @Test
    void roundNegativeRationalNumberToNPlace() {
        expected = -6;

        result = calcWithNegativeRationalNumber.roundTo(0).equals();

        assertEquals(expected, result);
    }

    @Test
    void calculatesRootOfPositiveWholeNumberCorrectly() {
        expected = 1.817f;

        result = calcWithPositiveWholeNumber.rootOf(3).roundTo(3).equals();

        assertEquals(expected, result);
    }

    @Test
    void calculatesNrootsOfNegativeWholeNumberCorrectly() {
        expected = -1.817f;

        result = calcWithNegativeWholeNumber.rootOf(3).roundTo(3).equals();

        assertEquals(expected, result);
    }

    @Test
    void returnsRoundedPI() {
        expected = 3.1416f;

        result = Calculator.PI.roundTo(4).equals();

        assertEquals(expected, result);
    }
}