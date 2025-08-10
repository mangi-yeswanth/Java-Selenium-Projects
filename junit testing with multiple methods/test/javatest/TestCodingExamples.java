package javatest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import javaexamples.CodingExample;

public class TestCodingExamples {
	CodingExample ce = new CodingExample();

	@Test
    public void testReverseTables() {
        List<Integer> expected = Arrays.asList(50, 45, 40, 35, 30, 25, 20, 15, 10, 5);
        List<Integer> actual = ce.reverseTables(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testPrintAlphabets() {
    	List<Character> expected = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        List<Character> actual = (List<Character>) ce.printAlphabets();

        assertEquals(expected, actual);
    }
    @Test
    public void testPrintASCIIValues() {
    	List<Integer> expected = Arrays.asList(97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122);
        List<Integer> actual = ce.printASCIIValues();
        assertEquals(expected, actual);
    }
    @Test
    public void testFactorial() {
       
        assertEquals(120, ce.factorial(5));
    }
    @Test
    public void testCountPosNegZero() {
    	int[] input = {1, -2, 0, 4, -5, 0};
        int[] expectedoutput = {2, 2, 2};
        int[] actualoutput = ce.countPosNegZero(input);
        assertArrayEquals(expectedoutput,actualoutput);
    }
    @Test
    public void testfindMinMax() {
    	int[] expected= {0,10};
    	int[] input= {0,5,3,7,2,8,10};
    	int[] actual=ce.findMinMax(input);
    	assertArrayEquals(expected,actual);
    }
    @Test
    public void testDivisibleBy9() {
     
        assertEquals(1683, ce.divisibleBy9());
    }
    @Test
    public void testOnesComplement() {
        assertEquals("0101",ce.onesComplement("1010"));
    }

    @Test
    public void testTwosComplement() {
        String input = "1010";
        String expected = "0110";
        String actual = ce.twosComplement(input);
        assertEquals(expected, actual);
    }
}
