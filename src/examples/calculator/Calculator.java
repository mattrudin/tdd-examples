package examples.calculator;

import javax.crypto.AEADBadTagException;
import java.math.BigDecimal;

public class Calculator implements Compute {
    private final float num;

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
        return new Calculator(round((float) Math.sqrt(num), 2));
    }

    private static float round(float number, int decimalPlace) {
        return BigDecimal.valueOf(number).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }

    @Override
    public float equals() {
        return num;
    }
}
