package examples.calculator;

import javax.crypto.AEADBadTagException;

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
    public float equals() {
        return num;
    }
}
