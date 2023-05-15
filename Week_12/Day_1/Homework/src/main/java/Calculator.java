public class Calculator {

    public int add(int value1, int value2){
        return (value1 + value2);
    }

    public int subtract(int value1, int value2){
        return (value1 - value2);
    }

    public int multiply(int value1, int value2){
        return (value1 * value2);
    }

    public double divide(double value1, double value2){
        double result = (value2 == 0.0) ? 0.0 : (value1 / value2);
        return (result);
    }
}
