package calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculate_1Test {

	@Test
	public void testAdd() {
		int actual = new Calculate_1().add(3, 4);
		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubstract() {
		int actual = new Calculate_1().substract(7, 8);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int actual = new Calculate_1().multiply(8, 9);
		assertEquals(72, actual);
	}

	@Test
	public void testDivide() {
		int actual = new Calculate_1().divide(10, 10);
		int expected = 10;
		assertEquals(expected, actual);
	}

}
