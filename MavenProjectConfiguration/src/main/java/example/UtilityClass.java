package example;

public class UtilityClass {

    public static int add(int x, int y) {
        return (x + y);
    }

    public static int sub(int x, int y) {
        return (x - y);
    }

    public static int mul(int x, int y) {
        return (x * y);
    }

    public static int div(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (x / y);
    }
}
