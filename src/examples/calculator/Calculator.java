package examples.calculator;

public class Calculator implements Compute {
    private final int num;

    public Calculator(int num) {
        this.num = num;
    }

    @Override
    public Compute add(int addend) {
        return new Calculator(num + addend);
    }

    @Override
    public Compute subtract(int subtrahend) {
        return new Calculator(num - subtrahend);
    }

    @Override
    public Compute multiply(int multiplier) {
        return new Calculator(num * multiplier);
    }

    @Override
    public int build() {
        return num;
    }
}
