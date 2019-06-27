package examples.calculator;

import java.math.BigDecimal;

public class Calculator implements Compute {
    private final float num;
    private final int DECIMAL_PLACE = 2;

    public Calculator(float num) {
        this.num = num;
    }

    @Override
    public Compute add(float addend) {
        return new Calculator(num + addend);
    }

    @Override
    public Compute subtract(float subtrahend) {
        return new Calculator(num - subtrahend);
    }

    @Override
    public Compute multiply(float multiplier) {
        return new Calculator(num * multiplier);
    }

    @Override
    public Compute divide(float divisor) {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return new Calculator(num / divisor);
    }

    @Override
    public Compute root() {
        return new Calculator((float) Math.sqrt(num));
    }

    @Override
    public Compute square() {
        return new Calculator(num * num);
    }

    @Override
    public Compute toPower(float exponent) {
        return new Calculator((float) Math.pow(num, exponent));
    }

    @Override
    public Compute roundTo(int decimalPlace) {
        return new Calculator(round(num, decimalPlace));
    }

    private static float round(float number, int decimalPlace) {
        return BigDecimal.valueOf(number).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }

    @Override
    public float equals() {
        return num;
    }
}
