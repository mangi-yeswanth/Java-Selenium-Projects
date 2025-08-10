package pkg_primenumber;
import java.util.Scanner;
public class PrimeNumber {
	public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Method call
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
	
	

}
