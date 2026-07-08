package divide_by_zero;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        try {
                int result = divide(a, b);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by 0");
            }

    }

    public static int divide(int a, int b) {
            return a / b;
        }
}
