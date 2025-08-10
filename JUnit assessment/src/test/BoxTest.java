package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Box;

public class BoxTest {
	Box Box = new Box();

	@Test
	public void testAreaOfTriangle() {
		double delta=0.01;
		assertEquals(10, Box.areaOfTriangle(5, 4),delta);
	}
	@Test
	public void testAreaOfSquare() {
		double delta=0.01;
		assertEquals(25,Box.areaOfSquare(5),delta);
	}
	@Test
	public void testAreaOfRectangle() {
		double delta=0.000001;
		assertEquals(53.01,Box.areaOfRectangle(9.3,5.7),delta);
	}
	@Test
	public void testSimpleInterest() {
		double delta=0.01;
		assertEquals(300,Box.simpleInterest(2000,5,3),delta);
	}
	@Test
	public void testAmount() {
		double delta=0.01;
		assertEquals(2615.25,Box.amount(2000,5,3),delta);
	}
	
	
}
