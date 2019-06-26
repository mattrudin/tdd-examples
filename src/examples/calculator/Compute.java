package examples.calculator;

public interface Compute {
    public Compute add(float addend);
    public Compute subtract(float subtrahend);
    public Compute multiply(float multiplier);
    public Compute divide(float divisor);
    public Compute root();
    public float equals();
}
