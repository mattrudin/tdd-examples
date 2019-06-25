package examples.calculator;

public class Calculator implements Compute {
    public Calculator(int num) {
    }

    @Override
    public Compute add(int addend) {
        return new Calculator(12);
    }

    @Override
    public int build() {
        return 12;
    }
}
