package test;

import calculator.Calculator;
import junit.framework.TestCase;

public class Test extends TestCase{
	
	private Calculator calculator = new Calculator();

	@org.junit.Test
	public void testPlus() {
		assertTrue(calculator.calculate("+", 1, 1) == 2);
	}
	
	@org.junit.Test
	public void testMinus() {
		assertTrue(calculator.calculate("-", 1, 1) == 0);
	}
}