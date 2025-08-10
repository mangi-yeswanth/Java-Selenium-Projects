package pkg_factorial;
import java.util.Scanner;
public class Factorial {
	public static long factorialOfNumber(int number) {
        long result = 1;
        if (number < 0) {
            System.out.println("given number is negative number .");
        } 
        else {
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        Factorial factorial=new Factorial();
        System.out.println("the factorial of the no is "+factorial.factorialOfNumber(number));

        scanner.close();
    }

}
