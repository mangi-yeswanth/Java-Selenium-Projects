package test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import pkg_stringseg.StringExampleCodes;
public class testStringExample {
	StringExampleCodes ex=new StringExampleCodes();
	@Test
	public void testHighestFrequency() {
		assertEquals('y',ex.highestFrequency("yyejflerwefoyykjeyyyyyyddhg"));
	}
	
	@Test
	public void testReplaceFirstVowel() {
		assertEquals("y-swanth",ex.replaceFirstVowel("yeswanth"));
	}
	@Test
	public void TestcountCharTypes() {
		int[] expected= {3,4,2};
		assertArrayEquals(expected,ex.countCharTypes("!a2f3g58@"));
	}
}
