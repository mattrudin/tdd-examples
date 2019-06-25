package examples.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Compute calc;
    private int result;

    @BeforeEach
    void create() {
        calc = new Calculator(5);
    }

    @Test
    void addsCorrectly() {
        result = calc.add(7).build();

        assertEquals(12, result);
    }

    @Test
    void subtractCorrectly() {
        result = calc.subtract(2).build();

        assertEquals(3, result);
    }

    @Test
    void multiplyCorrectly() {
        result = calc.multiply(5).build();

        assertEquals(25, result);
    }
}