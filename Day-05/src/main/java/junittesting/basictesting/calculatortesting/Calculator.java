package junittesting.basictesting.calculatortesting;

public class CalculatorTesting {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

//    public static void main(String[] args) {
//        System.out.println(add(2,3));
//    }
}
