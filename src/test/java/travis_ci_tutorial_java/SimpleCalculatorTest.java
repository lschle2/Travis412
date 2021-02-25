package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(15, 3), 5);
	}
	public void testTrue() {
		SimpleCalculator calc = new SimpleCalculator();
		int x = calc.add(3, 3);
		assertTrue(x == 6);
	}
	public void testFalse() {
		SimpleCalculator calc = new SimpleCalculator();
		int z = calc.minus(5, 3);
		assertFalse(z == 5);
	}
	public void testNull() {
		SimpleCalculator calc = new SimpleCalculator();
		int n = calc.minus(5, 3);
		assertNotNull(n);
	}
	public void testSame() {
		SimpleCalculator calc = new SimpleCalculator();
		int s = calc.minus(5, 3);
		assertSame(s, s);
	}
	public void testNotSame() {
		SimpleCalculator calc = new SimpleCalculator();
		int d = calc.minus(5, 3);
		int g = calc.add(3, 3);
		assertSame(d, g);
	}
}
