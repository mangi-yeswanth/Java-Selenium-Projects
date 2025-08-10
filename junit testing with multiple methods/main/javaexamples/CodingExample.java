package javaexamples;

import java.util.ArrayList;
import java.util.List;

public class CodingExample {
	public List<Integer> reverseTables(int i) {
	    List<Integer> result = new ArrayList<>();
	    for (int j = 10; j >= 1; j--) {
	        result.add(i * j);
	    }
	    return result;
	}

	public List<Character> printAlphabets() {
		List<Character>result=new ArrayList<>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			result.add(ch);
		}
		return result;
	}

	public List<Integer> printASCIIValues() {
		List<Integer> result = new ArrayList<>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			result.add((int) ch);
		}return result;
	}

	public long factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public int[] countPosNegZero(int[] numbers) {
	    int pos = 0, neg = 0, zero = 0;

	    for (int num : numbers) {
	        if (num > 0) pos++;
	        else if (num < 0) neg++;
	        else zero++;
	    }
	    int[] result= {pos,neg,zero};
	    return result;
	}

	public int[] findMinMax(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			System.out.println("No numbers provided.");
		}

		int min = numbers[0];
		int max = numbers[0];

		for (int num : numbers) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		int[] result= {min,max};
		return result;
	}

	public int divisibleBy9() {
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public String onesComplement(String binaryinput) {
		StringBuilder onesComplement = new StringBuilder();

		for (int i = 0; i < binaryinput.length(); i++) {
			char ch = binaryinput.charAt(i);
			if (ch == '0') {
				onesComplement.append('1');
			} else if (ch == '1') {
				onesComplement.append('0');
			}
		}

		return onesComplement.toString();
	}

	public String twosComplement(String binaryInput) {
		StringBuilder onescom = new StringBuilder();
		for (int i = 0; i < binaryInput.length(); i++) {
			char ch = binaryInput.charAt(i);
			if (ch == '0') {
				onescom.append('1');
			} else if (ch == '1') {
				onescom.append('0');
			}
		}
		StringBuilder twoscom = new StringBuilder();
		int carry = 1;

		for (int j = onescom.length() - 1; j >= 0; j--) {
			int bit = onescom.charAt(j) - '0';
			int sum = bit + carry;
			twoscom.insert(0, sum % 2);
			carry = sum / 2;
		}

		if (carry == 1) {
			twoscom.insert(0, '1');
		}

		return twoscom.toString();
	}

	public void fibonacciSeries(int n) {
		if (n <= 0) {
			System.out.println("entered  number is invalid!!!");
		} else {
			int a = 0, b = 1;

			for (int i = 1; i <= n; i++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}
		}
	}

}
