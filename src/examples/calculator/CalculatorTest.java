package examples.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addsCorrectly() {
        Compute calc = new Calculator(5);
        int result = calc.add(7).build();

        assertEquals(12, result);
    }
}