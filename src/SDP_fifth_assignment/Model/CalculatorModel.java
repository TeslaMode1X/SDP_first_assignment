package Model;

public class CalculatorModel {
    private int result;
    public void add(int first, int second) {
        result = first + second;
    }
    public void subtract(int first, int second) {
        result = first - second;
    }
    public void multiply(int first, int second) {
        result = first * second;
    }

    public void divide(int first, int second) {
        if (second != 0) {
            result = first / second;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public int getResult() {
        return result;
    }
}
