import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import main.java.Calculator;

public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(64, calc.add(60, 4));
	}

	@Test
	public void testSub() {
		assertEquals(20, calc.sub(50, 30));
	}

	@Test
	public void testMul() {
		assertEquals(100, calc.mul(10, 10));
	}

	@Test
	public void testDiv() {
		assertEquals(25, calc.div(100, 4));
	}
}
