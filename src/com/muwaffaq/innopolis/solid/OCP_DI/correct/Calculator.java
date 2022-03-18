package Test.SOLID;

class Calculator {
    public double calculate(Operation operation, double left, double right) {
        return operation.execute(left, right);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(new Add(), 5.0, 2.0);
    }
}
