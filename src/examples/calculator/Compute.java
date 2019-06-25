package examples.calculator;

public interface Compute {
    public Compute add(int addend);
    public Compute subtract(int subtrahend);
    public Compute multiply(int multiplier);
    public int build();
}
