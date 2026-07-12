package multiple_exceptions;

public class Main {
    public static void main(String[] args) {
        String[] data = {"1", "abc", "5", "0", "lol"};
        @SuppressWarnings("unused")
        int divisor = 0; // will cause ArithmeticException when used as denominator

        for (int i = 0; i <= data.length; i++) { // i <= length on purpose, to demo IndexOutOfBounds
            try {
                String value = data[i];                  // may throw IndexOutOfBoundsException
                int result = Integer.parseInt(value);     // may throw NumberFormatException
                int output = 100 / result;                // may throw ArithmeticException if result == 0

                System.out.println("100 / " + result + " = " + output);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of range!");
            } catch (NumberFormatException e) {
                System.out.println("Value is not a number!");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            } finally {
                System.out.println("Operation complete");
            }
        }
    }
}