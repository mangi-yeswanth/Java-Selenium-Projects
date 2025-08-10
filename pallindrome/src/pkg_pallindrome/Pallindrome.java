package pkg_pallindrome;
import java.util.Scanner;
public class Pallindrome {
public static boolean checkPallindrome (String input) {
	String reverse=new StringBuilder(input).reverse().toString();
	return input.equals(reverse);
	}

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // User input
    System.out.print("Enter a text: ");
    String input = scanner.nextLine();
    Pallindrome text =new Pallindrome();
    text.checkPallindrome(input);
    if (text.checkPallindrome(input)) {
        System.out.println("The text is a palindrome.");
    } else {
        System.out.println("The text is NOT a palindrome.");
    }
    scanner.close();
}

}
