package pkg_excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        double num, den, result = 0, arsum = 0;
        double[] arr = new double[]{1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            num = sc.nextDouble();

            System.out.print("Enter the denominator: ");
            den = sc.nextDouble();

            // Division with exception handling
            try {
                result = num / den;
                System.out.println("The division is: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

            // Array index handling
            try {
                arsum = arsum + arr[5]; // This will throw exception
                System.out.println("Array sum: " + arsum);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            sc.close();
            System.out.println("Program ended. Resources closed.");
        }
    }
}