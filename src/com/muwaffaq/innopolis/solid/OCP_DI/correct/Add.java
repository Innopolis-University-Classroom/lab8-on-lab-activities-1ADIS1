package Test.SOLID;

public class Add implements Operation {
    @Override
    public double execute(double left, double right) {
        return left + right;
    }
}
