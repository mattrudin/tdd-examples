package examples.calculator;

public interface Compute {
    public Compute add(float addend);
    public Compute subtract(float subtrahend);
    public Compute multiply(float multiplier);
    public Compute divide(float divisor);
    public Compute root();
    public Compute square();
    public Compute toPower(float exponent);
    public Compute roundTo(int decimalPlace);
    public float equals();
}
