package javaexamples;

public class Main {
	    public static void main(String[] args) {
	        CodingExample ce = new CodingExample();
	        System.out.println("table reverse ");
	        System.out.println(ce.reverseTables(5));
	        System.out.println("alphabets ");
	        ce.printAlphabets();
	        System.out.println();
	        System.out.println("ascii ");
	        System.out.println(ce.printASCIIValues());
	        System.out.println("fact of 5 ");
	        System.out.println(ce.factorial(5)); 
	        System.out.println("count of pos neg zero ");
	        int[] numbers = {1, -3, 5, 0, -2, 0, 7};
	        ce.countPosNegZero(numbers);
	        System.out.println("min and max terms");
	        ce.findMinMax(numbers);
	        System.out.println("sum of numbers divisible by 9 b/w 100 to 200 ");
	        ce.divisibleBy9();
	        System.out.println("ones comp ");
	        System.out.println(ce.onesComplement("10101")); 
	        System.out.println("twos comp ");
	        System.out.println(ce.twosComplement("10101"));
	        System.out.println("fibonacci ");
	        ce.fibonacciSeries(8);
	    }
	}
