import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        try {
            int quotient = divide(dividend, divisor);
            System.out.println("Division: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
